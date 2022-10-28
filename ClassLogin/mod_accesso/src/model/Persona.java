package model;

public class Persona {
	private String nome; //nome può essere usato solo da un metodo della classe persona --> dall'esterno è inaccessibile.
	//String cognome; //--> metodo utilizzabile dalle classi esterne solo se quelle classi fanno parte dello stesso package in cui è definito.
	private String cognome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void stampaInfo() {
		System.out.println(nome);
	}
	
}


/*
 * private --> più restrittivo, può essere usato sia su metodo che su attributo, sto dicendo che quel membro può essere usato solo ed esclusivamente da un metodo all'interno della classe in cui è definito.
 * 
 * package-private --> eredita la caratteristica del private -> lo ottengo omettendo il modificatore di accesso
 * 
 * protected --> ci si accede dallo stesso package o dalle sottoclassi
 * 
 * public --> meno restrittivo -> chiunque può accedervi
 * 
 * */
 