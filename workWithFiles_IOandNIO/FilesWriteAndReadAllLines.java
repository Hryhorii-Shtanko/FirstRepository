package workWithFiles_IOandNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesWriteAndReadAllLines {
    public static void main(String[] args) throws IOException {
        Path filePath=Paths.get("test10.txt");
        Files.createFile(filePath);
        String dialog = "-Hi\n-Hello\n-How is going?\n-All is OK. How is your`s?" +
                "\n-good";
Files.write(filePath, dialog.getBytes());
    }
}
