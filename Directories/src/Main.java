import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Path dir2Path = FileSystems.getDefault().getPath("Directories", "FileTree" + File.separator + "Dir2");
//        System.out.println(" Copy Dir2 to Dir4/Dir2Copy ");
//        Path copyPath = FileSystems.getDefault().getPath("Directories" + File.separator + "FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
//        try {
//            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        File file = new File("/Examples/file.txt");
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        File parent = new File("/Examples");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Examples", "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Examples");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("***DIR2 CONTENTS USING LIST()***");
        File dir2File = new File(workingDirectory, "/Directories/FileTree/Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i = 0; i < dir2Contents.length; i++) {
            System.out.println("i=" + i + ": " + dir2Contents[i]);
        }

        System.out.println("--- print Dir2 contents using listFiles() ---");
        File[] dir2Files = dir2File.listFiles();
        for (int i = 0; i < dir2Files.length; i++) {
            System.out.println("i=" + i + ": " + dir2Files[i].getName());
        }

    }
}
