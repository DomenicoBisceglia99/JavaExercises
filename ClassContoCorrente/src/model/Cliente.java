package model;

public class Cliente {
	private final String NOME;
	private final String COGNOME;
	private ContoCorrente conto;
	
	public Cliente(String nome, String cognome) {
		this.NOME = nome;
		this.COGNOME = cognome;
	}
	
	public String getNome() {
		return NOME;
	}
	
	public String getCognome() {
		return COGNOME;
	}
	
	public void setContoCorrente(ContoCorrente conto) {
		this.conto = conto;
	}
	
	public ContoCorrente getConto() {
		return this.conto;
	}
	
}
