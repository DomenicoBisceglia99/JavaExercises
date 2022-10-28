package model;

public class Studente extends Persona{
	public double mediaVoti;
	
	public Studente(String nome, String cognome, int eta, double mediaVoti) {
		super(nome, cognome, eta); //istruzione che consente dall'interno del costruttore della sotto classe di chiamare il costruttore della classe padre --> deve essere la prima istruzione del costruttore, e può essere usata soloa ll'interno del costruttore.
		this.mediaVoti = mediaVoti;
	}
	
	@Override
	public void stampaInfo() {
		System.out.println("sto nella versione stampa info studente");
	}


	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
	
}
