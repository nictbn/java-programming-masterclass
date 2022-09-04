import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();
            Path dataPAth = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPAth, "\nLine 4".getBytes("UTF-8"), StandardOpenOption.APPEND);
            List<String> lines = Files.readAllLines(dataPAth);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
