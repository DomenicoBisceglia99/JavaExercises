package test;

import java.math.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer intero = Integer.valueOf(input.next());
		Character carattere = Character.valueOf(input.next().charAt(0));
		Float fp = Float.valueOf(input.next());
		Double db = Double.valueOf(input.next());
		Boolean bool = Boolean.valueOf(input.next());
		
		System.out.println(intero);
		System.out.println(carattere);
		System.out.println(fp);
		System.out.println(db);
		System.out.println(bool);
		
		if(bool) {
			System.out.println(Math.sqrt(intero + fp + db));
		}else {
			System.out.println(Math.pow(intero + fp + db, 2));
		}
		
	}
}
