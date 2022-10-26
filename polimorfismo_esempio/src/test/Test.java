package test;

import model.Studente;
import model.Docente;
import model.Persona;

public class Test {
	
	public static void main(String[] args) {
		Studente s = new Studente("mario", "rossi", 24, 0.0);
		s.setMediaVoti(24);
		
		Persona s2 = new Studente("luca", "verdi", 26, 0.0);
		//s2.getMediaVoti(); non è consentito, perchè sto trattando lo studente s2 come persona
		
	}
}
