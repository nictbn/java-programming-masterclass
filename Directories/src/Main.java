import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path dir2Path = FileSystems.getDefault().getPath("Directories", "FileTree" + File.separator + "Dir2");
        System.out.println(" Copy Dir2 to Dir4/Dir2Copy ");
        Path copyPath = FileSystems.getDefault().getPath("Directories" + File.separator + "FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
