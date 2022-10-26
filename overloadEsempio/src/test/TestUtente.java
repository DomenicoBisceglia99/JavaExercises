package test;

import model.Utente;

public class TestUtente {
	public static void main(String[] args) {
		//Utente u = new Utente();
		Utente.registra("Mario", "Rossi", 34, 1.78);
		Utente.registra("Domenico", "Bisceglia");
	}
}
