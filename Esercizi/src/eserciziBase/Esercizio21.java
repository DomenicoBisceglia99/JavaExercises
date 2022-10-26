package eserciziBase;

import java.util.Scanner;

/*
 * Esercizio 21
Scrivere un programma che dato questo array di stringhe in input:
String[] nomi = {“Antonio”,”Rosaria”,”Mario”,”Luisa”,”Francesco”,”Roberta”,”Simone”,
Francesca};
dica il numero di volte in cui compaia un nome preso in input. Il programma deve funzionare anche
se l’array cambia dimensione.
 * */
public class Esercizio21 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String[] nomi = {"Antonio","Rosaria","Mario","Luisa","Francesco","Roberta", "Simone", "Francesca"};
		System.out.println("Inserisci un nome: ");
		String s = input.nextLine();
		int cont = 0;
		for(int i = 0; i < nomi.length; i++) {
			if(s.equals(nomi[i])) {
				cont++;
			}
		}
		if (cont > 0) {
			System.out.println("Il nome da te inserito è presente "+ cont+ " volte");
		}		
	}
}
