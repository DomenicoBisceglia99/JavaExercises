/*
 * Esercizio 1
 Scrivere un programma che confronta due numeri interi a e b e determina qual è il numero più
 grande.


 * */
package eserciziBase;

public class Esercizio1 {

	public static void main(String[] args) {
		int a = 10, b = 2;
		if(a>b){
			System.out.println(a);
		}else if(b>a) {
			System.out.println(b);
		}else {
			System.out.println("I due numeri sono uguali.");
		}

	}

}
