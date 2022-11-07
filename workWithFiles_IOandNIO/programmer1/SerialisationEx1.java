package workWithFiles_IOandNIO.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Gregory");
        employees.add("Mykola");
        employees.add("Olena");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees.bin")
        )) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

