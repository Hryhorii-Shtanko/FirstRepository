package workWithFiles_IOandNIO;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("test2.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
