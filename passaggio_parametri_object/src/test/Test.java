package test;

import model.Automobile;
import util.PersonalizzaAuto;

public class Test {
	public static void main(String[] args) {
		Automobile auto = new Automobile("Verde");
		auto.stampaInfo();
		PersonalizzaAuto.aggiungiAlettone(auto);
		PersonalizzaAuto.aggiungiNos(auto);
		auto.stampaInfo();
		PersonalizzaAuto.aggiungiLed(auto, "Arancione");
		auto.stampaInfo();
	}
}
