package workWithFiles_IOandNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesWriteAndReadAllLinesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath=Paths.get("test10.txt");

        List<String> list= Files.readAllLines(filePath);
        for (String s: list){
            System.out.println(s);
        }
    }
}
