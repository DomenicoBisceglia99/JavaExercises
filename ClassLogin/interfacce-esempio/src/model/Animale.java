package model;

public abstract class Animale {
	private String codice;
	
	public Animale(String codice) {
		this.codice = codice;
	}

	public abstract void mangia();
		
	
	public String getCodice() {
		return codice;
	}
	

	public void setCodice(String codice) {
		this.codice = codice;
	}


	
	
	
}
