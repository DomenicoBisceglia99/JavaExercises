package metodi;

import model.Cellulare;

public class Test {
	public static void main(String[] args) {
		Cellulare cellulare = new Cellulare("3335670922");
		cellulare.ricarica(10);
		
		double ricaricaAttualeDopoChiamata = cellulare.chiama("3320982188");
		System.out.println("Il tuo credito attuale è: " + ricaricaAttualeDopoChiamata);
	}
}
