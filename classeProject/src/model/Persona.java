package model;

public class Persona extends Object{
	//quando creo una classe semplice, Java in automatico estende la classe Object (superclasse in assoluto di tutte le classi, contiene dei metodi che sono comuni a tutti gli oggetti)
	public String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return ;
	}

	
	
	
	
}
