package workWithFiles_IOandNIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\it05082022\\Desktop\\A");
        File file1 = new File("C:\\Users\\it05082022\\Desktop\\A\\test1.txt");
        File file2 = new File("C:\\Users\\it05082022\\Desktop\\A\\test2.txt");
        File folder2 = new File("C:\\Users\\it05082022\\Desktop\\B");
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        System.out.println("-------------------------------------");

        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-------------------------------------");

        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-------------------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("file2.exists() " + file1.exists());
        System.out.println("folder2.exists() " + folder2.exists());
        System.out.println("-------------------------------------");

        System.out.println("file2.createNewFile() " + file1.createNewFile());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("file.createNewFile() " + file.createNewFile());
        System.out.println("-------------------------------------");

        System.out.println("file2.length() " + file1.length());
        System.out.println("folder.length() " + folder.length());
        System.out.println("-------------------------------------");


        System.out.println("folder2.delete() " + folder2.delete());
        System.out.println("file2.delete() " + file2.delete());
        System.out.println("-------------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-------------------------------------");

        System.out.println("file2.isHidden() " + file1.isHidden());
        System.out.println("file2.canRead() " + file1.canRead());
        System.out.println("file2.canWrite() " + file1.canWrite());
        System.out.println("file2.canExecute() " + file1.canExecute());
    }
}
