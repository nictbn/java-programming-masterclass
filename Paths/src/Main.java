import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println();
        Path filePath = FileSystems.getDefault().getPath("Paths","files", "SubdirectoryFile.txt");
        printFile(filePath);

//        filePath = Paths.get("ThisShouldBeAnAbsolutePath");
//        printFile(filePath);
    }

    public static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line  = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
