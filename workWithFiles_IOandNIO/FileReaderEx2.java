package workWithFiles_IOandNIO;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx2 {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader("test2.txt");
             FileWriter writer = new FileWriter("test2.txt", true);) {

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        }
    }
}
