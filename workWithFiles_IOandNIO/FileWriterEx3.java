package workWithFiles_IOandNIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx3 {
    public static void main(String[] args) throws IOException {
        String rubai = "Anxiously I began this course\n" +
                "With life my awe grew even worse\n" +
                "Unwillingly returned with force\n" +
                "What was the point, I ask my source.\n";
        String s = "Hello";

        try (FileWriter writer = new FileWriter("test2.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
