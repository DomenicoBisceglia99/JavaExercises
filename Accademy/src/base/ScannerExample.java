package base;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa : ");
		String s = input.nextLine();
		System.out.println(s);
	}

}
