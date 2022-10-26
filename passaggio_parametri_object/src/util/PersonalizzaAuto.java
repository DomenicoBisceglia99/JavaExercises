package util;

import model.Automobile;

public class PersonalizzaAuto {
	public static void aggiungiAlettone(Automobile a) {
		a.alettone = true;
	}
	
	public static void aggiungiNos(Automobile a) {
		a.nos = true;
	}
	
	public static void aggiungiLed(Automobile a, String colore) {
		a.led = colore;
	}
	
}
