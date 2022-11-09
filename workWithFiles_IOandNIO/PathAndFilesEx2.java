package workWithFiles_IOandNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\it05082022\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\it05082022\\Desktop\\B");

        Files.copy(filePath, directoryPath.resolve(filePath)
                , StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("test16.txt"));
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("Done");

    }
}
