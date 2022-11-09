package workWithFiles_IOandNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PathAndFilesEx5 {
    public static void main(String[] args) throws IOException {

        Files.delete(Paths.get("test5.txt"));
        System.out.println("Done");

    }
}
