package workWithFiles_IOandNIO;

import java.io.*;

public class CopyEx1 {
    public static void main(String[] args) {
        try (BufferedReader reader= new BufferedReader(
                new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("test3.txt"))
        ){
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
