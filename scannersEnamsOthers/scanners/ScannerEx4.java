package scanners;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);

		System.out.println("Write two Lines");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		System.out.println("You wrote in first line: " + s1);
		System.out.println("You wrote in secend line: " + s2);
	}

}


