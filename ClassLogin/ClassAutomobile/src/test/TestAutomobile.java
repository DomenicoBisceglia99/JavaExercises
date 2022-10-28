package test;

import model.Automobile;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile auto = new Automobile();
		auto.marca = "Fiat";
		auto.modello ="Grande Punto";
		auto.targa = "DN000DT";
		
		auto.stampaInfo();
		
	}

}
