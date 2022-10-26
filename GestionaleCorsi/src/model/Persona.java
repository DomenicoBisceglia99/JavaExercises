package model;

import java.nio.file.spi.FileSystemProvider;

public class Persona {
	protected String nome;
	protected String cognome;
	protected String dataDiNascita;
	
	public Persona(String nome, String cognome, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	public void presentati() {
		System.out.println("______________________________");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
		System.out.println("Data di nascita: " + this.dataDiNascita);
	}
	
	
}
