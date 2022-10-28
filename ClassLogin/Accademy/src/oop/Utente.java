package oop;



public class Utente {
	//variabili di classe, appartengono ad ogni elemento di classe
	private String nome;
	private String cognome;
	private String email;
	private String password;
	
	
	//COSTRUTTORE --> sto definendo gli elementi di questo oggetto
	public Utente(String nome, String cognome, String email, String password) {
		this.nome     = nome;
		this.cognome  = cognome;
		this.email    = email;
		this.password = password;
	}
	
	//un oggetto svolge operazioni con i propri metodi
	
	//METODI
	public void stampaDati() {
		System.out.println(this.nome + " " + this.cognome+ " " + this.email);
	}
	
	//getter e setter --> metodi standard presenti in ogni classe (tranne qualche eccezione)
	public String getNome() {
		return this.nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
