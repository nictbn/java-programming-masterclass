import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume name / Drive letter = " + store);
            System.out.println("File store = " + store.name());
        }

        System.out.println("********************************************************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }
    }
}
