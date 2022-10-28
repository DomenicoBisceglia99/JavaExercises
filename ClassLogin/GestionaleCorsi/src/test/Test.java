package test;
//matricola counter è static

import model.Docente;
import model.Persona;
import model.Studente;
import model.Aula;
import model.Esame;

public class Test {
	public static void main(String[] args) {
		Studente s1 = new Studente("Domenico", "Bisceglia", "21/11/1999");
		//System.out.println(s1.getMatricola());
		Studente s2 = new Studente("Paolo", "Rossi", "11/12/1980");
		//System.out.println(s2.getMatricola());
		Studente s3 = new Studente("Paola", "Verdi", "12/11/1998");
		//System.out.println(s2.getMatricola());		
		Docente doc = new Docente("Giuseppina", "Pappappero", "1/1/1913", "Medicina");
		
		Aula aula = new Aula(doc);
		aula.aggiungiStudente(s1);
		aula.aggiungiStudente(s2);
		aula.aggiungiStudente(s3);
		
		Esame ex = new Esame(18, "26/10/22", doc);
		s1.aggiungiEsame(ex);
		Esame ex1 = new Esame(30, "26/10/22", doc);
		s1.aggiungiEsame(ex1);
		s2.aggiungiEsame(ex1);
		Esame ex2 = new Esame(21, "26/10/22", doc);
		s3.aggiungiEsame(ex2);
		
		s1.presentati();
		s2.presentati();
		s3.presentati();
		
		
		
		
		
		
		System.out.println("______________________________");
		System.out.println("______________________________");
		System.out.println("Media dei voti di tutta l'aula : " + aula.calcolaMediaVoti());
		System.out.println("Numero complessivo di esami svolto dagli studenti di quest'aula : " + aula.calcolaNumeroEsami());
		System.out.println("______________________________");
		System.out.println("______________________________");
		
		
		
		
	}
}
