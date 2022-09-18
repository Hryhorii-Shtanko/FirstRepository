package scanners;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
System.out.println("Print 2 numbers");
int x = scanner.nextInt();
int y = scanner.nextInt();
System.out.println("Quotient of division = " + x/y);
System.out.println("Remainder of division = " + x%y);
	}

}
