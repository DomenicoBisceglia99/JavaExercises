package model;

public class Utente {
	public String nome;
	public String cognome;
	public int eta;
	public double altezza;
	
	public static void registra(String nome, String cognome, int eta, double altezza) {
		System.out.println("Sto registrando l'utente nel sistema con i 4 dati");
	}
	
	public static void registra(String nome, String cognome) {
		System.out.println("Sto registrando l'utente nel sistema con 2 dati");
	}
	
	
}
