package model;

public class Elicottero extends Veicolo implements Volante{
	private String colore;
	
	public Elicottero(String colore) {
		this.colore = colore;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void viaggia() {
		System.out.println("Sto viaggiando in elicottero");
	}
	
	public void decolla() {
		System.out.println("Sto decollando");
	}
	
	public void atterra() {
		System.out.println("Sto atterrando");
	}
	
}
