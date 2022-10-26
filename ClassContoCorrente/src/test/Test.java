package test;

import java.util.Scanner;

import model.Cliente;
import model.ContoCorrente;

/*
 * + significa public
 * - significa private
 * */
public class Test {
	public static void main(String[] args) {	
		Cliente cliente = new Cliente("Domenico", "Bisceglia");
		ContoCorrente cc = new ContoCorrente("12345");
		cliente.setContoCorrente(cc);	//in questo modo sto relazionando i due oggetti, sto assegnando a domenico bisceglia il conto con pin 12345
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		do {
			
			double importo = 0;
			System.out.println("Inserisci il numero relativo all'azione che vuoi eseguire: \n1 - versa denaro;\n2 - preleva denaro;\n3 - verifica saldo;\n99 - exit.");
			String scelta = input.nextLine();
			switch (scelta){
				case "1":
					importo = inserisciImporto();
					cliente.getConto().versa(importo);
					break;
				case "2":
					importo = inserisciImporto();
					cliente.getConto().preleva(importo);
					break;
				case "3":
					System.out.println(cliente.getConto().getSaldo());
					break;
				case "99":
					exit = true;
					break;
				default:
					exit = true;
					System.out.println("Il codice che hai inserito non è valido!");
			}
		}while(exit == false);
		
	}
	
	private static double inserisciImporto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci importo : ");
		double importo = Double.parseDouble(input.nextLine());
		return importo;
	}
	
}
