import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        try {
            Path fileToMove = FileSystems.getDefault().getPath("Paths", "Examples", "file1copy.txt");
            Path destination = FileSystems.getDefault().getPath("Paths", "Examples", "Dir1", "file1copy.txt");
            Files.move(fileToMove, destination);
//            Path sourceFile = FileSystems.getDefault().getPath("Paths", "Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Paths", "Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Paths", "Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
