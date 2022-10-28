package model;

public class Cellulare {
	public String numero;
	public double ricarica;
	
	public Cellulare(String numero) {
		this.numero = numero;
		this.ricarica = 0.0;
	}
	
	public void ricarica(double creditoDaAccumulare) {
		ricarica = ricarica + creditoDaAccumulare;
	}
	
	public double chiama(String numeroTelefonoDaChiamare) {
		System.out.println("Il cellulare con il numero " + numero + " sta chiamando " + numeroTelefonoDaChiamare);
		ricarica--;
		return ricarica;
	}
	
}
