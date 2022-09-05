import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            Path fieToCreate = FileSystems.getDefault().getPath("Paths","Examples", "file3.txt");
            Files.createFile(fieToCreate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
