package model;

public class Docente extends Persona{
	public String materia;
	
	public Docente(String nome, String cognome, int eta, String materia) {
		super(nome, cognome, eta);
		this.materia = materia;
	}
	
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println(materia);
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
