package test;

import model.Automobile;
import model.Elicottero;
import model.Veicolo;
import model.Volante;

public class Test {
	public static void main(String[] args) {
		Veicolo auto = new Automobile("Rossa");
		Volante elico = new Elicottero("Giallo");
		((Elicottero)elico).accendi();
		elico.decolla();
		elico.atterra();
		((Elicottero)elico).spegni();
		
		auto.accendi();
		auto.spegni();
	
		
		
		
	}
	
	
}
