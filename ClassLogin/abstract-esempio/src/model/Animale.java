package model;

public abstract class Animale {
	
	private String codice;
	
	public Animale(String codice) {
		this.codice = codice;
	}
	
	public abstract void mangia();
}
