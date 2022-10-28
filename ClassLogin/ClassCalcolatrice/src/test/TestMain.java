package test;

import util.Calcolatrice;

public class TestMain {

	public static void main(String[] args) {
		double numero1 = 10;
		double numero2 = 21;
		double numero3 = 22;
		double numero4 = 11;
		int numero5 = 5;
		float numero6 = 1;
		long numero7 = 10;
		
		System.out.println("Il maggiore tra i due numeri è: " + Calcolatrice.maggiore(numero1, numero2, numero3, numero4));
		System.out.println("Il minore tra i due numeri è: " + Calcolatrice.minore(numero1, numero2, numero3, numero4));
		System.out.println("La somma tra i due numeri è: " + Calcolatrice.somma(numero1, numero2, numero3, numero4));
		System.out.println("Il prodotto tra i due numeri è: " + Calcolatrice.prodotto(numero1, numero2, numero3, numero4));
		System.out.println("La media tra i due numeri è: " + Calcolatrice.media(numero1, numero2, numero3, numero4));
		
		
		System.out.println(Calcolatrice.somma(numero6, numero6));
		System.out.println(Calcolatrice.somma(numero5, numero6, numero7));
		System.out.println(Calcolatrice.somma(numero5, numero5, numero5));
		
		
		
	}

}
