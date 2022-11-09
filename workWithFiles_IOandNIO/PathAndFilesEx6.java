package workWithFiles_IOandNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx6 {
    public static void main(String[] args) throws IOException {
        Path directoryPath = Paths.get("C:\\Users\\it05082022\\Desktop\\M");

        Files.delete(directoryPath);
        System.out.println("Done");
    }
}
