package test;

import util.Utilities;

public class TestMain {
	public static void main(String[] args) {
		/*
		final int NUMERO = 10; // --> le costanti vanno scritte in maiuscolo.
		System.out.println(NUMERO);
		//numero = 100; // --> nel momento in cui aggiungo final sopra, questo codice non compila, questa linea è nulla, non posso modificare il valore dell'attributo numero.
		System.out.println(NUMERO);*/
		String marca = "Fiat%";
		if(Utilities.isMarcaValida(marca)) {
			Automobile auto = new Automobile("Fiat", "Panda");
			auto.stampaInfo();
		}
		
		
		Automobile auto2 = new Automobile("Opel", "Corsa");
		auto2.stampaInfo();
		
		//Automobile.nRuote = 6;
		Automobile.modificaNruote(6);
		//auto.stampaInfo();
		auto2.stampaInfo();
		
	}
}
