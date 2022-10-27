package model;

import java.util.Arrays;

public class Programmatore extends Dipendente{
	private double bonus;
	private String[] linguaggiProg;
	private String[] certificazioni;
	
	public Programmatore(String nome, String cognome, double stipendio) {
		super(nome, cognome, stipendio);
		this.bonus = 300;
		linguaggiProg = new String[10];
		certificazioni = new String[10];
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String[] getLinguaggiProg() {
		return linguaggiProg;
	}

	public String[] getCertificazioni() {
		return certificazioni;
	}

	public void aggiungiLinguaggio(String linguaggio) {
		for(int i = 0; i < linguaggiProg.length; i++) {
			if(linguaggiProg[i] == null) {
				linguaggiProg[i] = linguaggio;
				break;
			}
		}
	}
	
	public void aggiungiCertificazione(String certificazione) {
		for(int i = 0; i < linguaggiProg.length; i++) {
			if(certificazioni[i] == null) {
				certificazioni[i] = certificazione;
				break;
			}
		}
	}
	
	public void rimuoviLinguaggio(int indice) {
		if(linguaggiProg[indice] != null) {
			linguaggiProg[indice] = null;
		}
	}
	
	public void rimuoviCertificazione(int indice) {
		if(certificazioni[indice] != null) {
			certificazioni[indice] = null;
		}
	}
	
	
	public String toString() {
		
		String s = super.toString() + "Linguuaggi conosciuti : ";
		
		for(int i = 0; i < linguaggiProg.length; i++) {
			if(linguaggiProg[i] != null) {
				s = s + linguaggiProg[i] + ", ";
			}
		}
		
		s = s + "\nLista certificazioni : ";
		for(int i = 0; i < certificazioni.length; i++) {
			if(certificazioni[i] != null) {
				s = s + certificazioni[i] + ", ";
			}
		}
		
		s = s + "\nBonus : " + bonus + "\n";
		
		return s;
	}
	
	
	
	public void lavora() {
		System.out.println("il dipendente è un programmatore.");
	}

	/*@Override
	public String toString() {
		return "Programmatore [bonus=" + bonus + ", linguaggiProg=" + Arrays.toString(linguaggiProg)
				+ ", certificazioni=" + Arrays.toString(certificazioni) + "]";
	}*/
	
	
	
}
