package model;

public class Studente {
	private String nome;
	private String cognome;
	private float mediaVoti;
	
	public Studente(String nome, String cognome, float mediaVoti) {
		this.nome = nome;
		this.cognome = cognome;
		if(mediaVoti >= 0 && mediaVoti <= 31) {
			this.mediaVoti = mediaVoti;
		}else {
			this.mediaVoti = 0;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public float getMediaVoti() {
		return mediaVoti;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setMediaVoti(float mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
	
	public void stampaInfo() {
		System.out.println("Studente: ");
		System.out.println("	Nome: " + this.nome);
		System.out.println("	Cognome: " + this.cognome);
		System.out.println("	Media Voti: " + this.mediaVoti);
		System.out.println("______________________________");
	}
	
}
