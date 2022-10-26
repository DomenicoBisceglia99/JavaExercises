package model;

public class Docente {
	private String nome;
	private String cognome;
	private String materia;
	
	public Docente(String nome, String cognome, String materia) {
		this.nome = nome;
		this.cognome = cognome;
		this.materia = materia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void stampaInfo() {
		System.out.println("Docente: ");
		System.out.println("	Nome: " + this.nome);
		System.out.println("	Cognome: " + this.cognome);
		System.out.println("	Materia: " + this.materia);
		System.out.println("______________________________");
	}
}
