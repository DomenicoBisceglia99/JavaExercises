package test;

import model.Azienda;
import model.Dipendente;
import model.Grafico;
import model.Programmatore;
public class Test {

	public static void main(String[] args) {
		Azienda rilfactory = new Azienda("RILFactory");
		Grafico marco = new Grafico("Marco", "Sam", 1300, "grafichette belle");
		Programmatore domenico = new Programmatore("Domenico", "Bisceglia", 1300);
		Dipendente fuki = new Programmatore("Thomas", "Fuki", 3000);
		Dipendente carlo = new Dipendente("Carlo", "Doc", 8000);
		
		
		domenico.aggiungiLinguaggio("Java");
		domenico.aggiungiLinguaggio("HTML");
		domenico.aggiungiLinguaggio("CSS");
		domenico.aggiungiLinguaggio("Angular");
		domenico.aggiungiLinguaggio("linguaggiofinto");
		domenico.aggiungiCertificazione("IT bla bla");
		domenico.aggiungiCertificazione("Reti bla bla");
		domenico.rimuoviLinguaggio(4);
		domenico.rimuoviCertificazione(1);
		
		domenico.lavora();
		System.out.println(domenico.toString());
		
		System.out.println("__________________");
		
		marco.lavora();
		System.out.println(marco.toString());
		
		fuki.lavora();
		System.out.println(fuki.toString());
		
		
		rilfactory.aggiungiDipendente(domenico);
		rilfactory.aggiungiDipendente(carlo);
		rilfactory.aggiungiDipendente(marco);
		rilfactory.aggiungiDipendente(fuki);
		System.out.println("******************************");
		rilfactory.listaDipendenti();
	}

}
