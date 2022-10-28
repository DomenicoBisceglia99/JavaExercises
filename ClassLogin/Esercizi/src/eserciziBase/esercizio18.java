package eserciziBase;

public class esercizio18 {
	public static void main(String[]args) {
		/*
		 * Creare un Array di interi contenente 10 numeri a piacere. Creare un ciclo che stampi a video il
totale della somma e un altro ciclo che stampi il totale della moltiplicazione.
		 * */
		int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i = 0; i < numeri.length; i++) {
			sum = sum + numeri[i];
		}
		System.out.println(sum);
		int mul = 1;
		for(int i = 0; i < numeri.length; i++) {
			mul = mul * numeri[i];
		}
		System.out.println(mul);
	}
}
