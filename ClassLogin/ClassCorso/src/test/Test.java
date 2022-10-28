package test;

import model.Corso;
import model.Docente;
import model.Studente;

public class Test {

	public static void main(String[] args) {
		Corso corso = new Corso("Informatica");
		Docente docente = new Docente("Paolo", "Bitta", "Programmazione");
		corso.setDocente(docente);
		Studente s1 = new Studente("Domenico", "Bisceglia", 29);
		Studente s2 = new Studente("Aldo", "Baglio", 31);
		corso.aggiungiStudente(s1);
		corso.aggiungiStudente(s2);
		corso.stampaInfo();
		System.out.println("La media dei voti del corso e' : " + corso.mediaStudenti());
		
		corso.rimuoviStudente(0);
		corso.rimuoviStudente("Aldo", "Baglio");
		Studente s3 = new Studente("Giacomo", "Poretti", 31);
		corso.aggiungiStudente(s3);
		corso.stampaInfo();
		System.out.println("La media dei voti del corso e' : " + corso.mediaStudenti());
		
		
		
		
	}

}
