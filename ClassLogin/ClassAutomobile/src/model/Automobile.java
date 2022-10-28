package model;

public class Automobile {
	public String marca;
	public String modello;
	public String targa;
	public int numeroRuote;
	public boolean motoreAcceso;
	
	public Automobile() {
		numeroRuote = 4;
		motoreAcceso = false;
	}
	
	public void stampaInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modello: " + modello);
		System.out.println("Targa: " + targa);
		System.out.println("Numero ruote: " + numeroRuote);
		if(motoreAcceso) {
			System.out.println("Il motore è acceso");	
		}else {
			System.out.println("Il motore è spento");
		}
	}
	
}
