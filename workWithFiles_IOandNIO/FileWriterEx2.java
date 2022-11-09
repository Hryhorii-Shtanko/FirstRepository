package workWithFiles_IOandNIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx2 {
    public static void main(String[] args) throws IOException {
        String rubai = "Anxiously I began this course\n" +
                "With life my awe grew even worse\n" +
                "Unwillingly returned with force\n" +
                "What was the point, I ask my source.\n";
        String s = "Hello";
        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt", true);
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
