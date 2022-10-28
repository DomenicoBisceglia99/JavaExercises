package model;

public class Docente extends Persona{
	private String materia;
	
	public Docente(String nome, String cognome, String dataDiNascita, String materia) {
		super(nome, cognome, dataDiNascita);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public void presentati() {
		super.presentati();
		System.out.println("Materia: " + materia);
	}
	
}
