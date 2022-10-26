package model;

import java.util.Scanner;

public class ContoCorrente {
	private double saldo;
	private String PIN;
	
	public ContoCorrente(String pin) {
		this.PIN = pin;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getPIN() {
		return PIN;
	}
 
	
	public void preleva(double importo) {
		if(controllo()) {
			if(saldo >= importo) {
				System.out.println("prelievo in corso . . .");
				this.saldo = this.saldo - importo;				
			}else {
				System.out.println("Saldo insufficiente!");
			}
		}else {
			System.out.println("PIN ERRATO!");
		}
	}
	
	public void versa(double importo) {
		if(controllo()) {
			if(importo > 0) {
				System.out.println("versamento in corso . . .");
				this.saldo = this.saldo + importo;			
				System.out.println(saldo);				
			}else {
				System.out.println("Importo non valido.");
			}
		}else {
			System.out.println("PIN ERRATO!!");
			
		}
	}
	
	public boolean controllo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il Pin: ");
		String pinInserito = input.nextLine();
		if((this.PIN).equals(pinInserito)) {
			return true;
		}
		return false;
		
	}
	
}
