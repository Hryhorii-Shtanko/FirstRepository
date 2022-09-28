package scanners;

import java.util.Scanner;

public class ScannerEx7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner("Hi my Friend!" + "\nHow you doing?" + "\nWhat is new");

//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}

		System.out.println(scanner.next().charAt(2));
		scanner.close();
	}

}
 