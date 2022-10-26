package model;

public class Persona {
	public String nome;
	public String cognome;
	public int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	protected void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void stampaInfo() {
		System.out.println(nome);
		System.out.println(cognome);
		System.out.println(eta);
	}
	
}
