package workWithFiles_IOandNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx4 {
    public static void main(String[] args) throws IOException {

        Files.move(Paths.get("test10.txt"),(Paths.get("test11.txt"))) ;
        System.out.println("Done");

    }
}
