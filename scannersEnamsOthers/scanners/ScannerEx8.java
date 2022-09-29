package scanners;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx8 {
	public static void main(String[] args) {
		
Scanner scanner = null;
Set<String> set = new TreeSet<>();
try {
	scanner = new Scanner(new FileReader(
			new File("‪C:\\Users\\it05082022\\Desktop\\Shakespire.txt")));
	scanner.useDelimiter("\\W");
	while (scanner.hasNext()) {
		String word = scanner.next();
		set.add(word);
				// type = (type) en.nextElement();
					}
	for(String word: set) {
		System.out.println(word);
	}
}
catch(FileNotFoundException e) {
	System.out.println("We have a problem!");
}
finally {
	scanner.close();
	
}
}
}