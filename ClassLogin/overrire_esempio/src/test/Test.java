package test;

import model.Studente;
import model.Docente;


public class Test {
	
	public static void main(String[] args) {
		Studente s = new Studente("mario", "rossi", 24, 0.0);
		s.stampaInfo();
		
		Docente d = new Docente("luca", "verdi", 45, "sql");
		d.stampaInfo();
	}
}
