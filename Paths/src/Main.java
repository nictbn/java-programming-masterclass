import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            Path dirToCreate = FileSystems.getDefault().getPath("Paths","Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
            Files.createDirectories(dirToCreate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
