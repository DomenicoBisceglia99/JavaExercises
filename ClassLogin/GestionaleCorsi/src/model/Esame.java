package model;

public class Esame {
	private int voto;
	private String data;
	private Docente docente;
	
	public Esame(int voto, String data, Docente docente) {
		this.voto = voto;
		this.data = data;
		this.docente = docente;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
	
}
