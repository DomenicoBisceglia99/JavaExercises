package model;

public class Studente extends Persona{
	private Esame[] esami = new Esame[10];
	private String matricola;
	private static int matricolaCounter;

	public Studente(String nome, String cognome, String dataDiNascita) {
		super(nome, cognome, dataDiNascita);
		this.matricola = generaMatricola();
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public Esame[] getEsami() {
		return esami;
	}

	public void setEsami(Esame[] esami) {
		this.esami = esami;
	}

	public static int getMatricolaCounter() {
		return matricolaCounter;
	}

	public static void setMatricolaCounter(int matricolaCounter) {
		Studente.matricolaCounter = matricolaCounter;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public void presentati() {
		super.presentati();
		System.out.println("Matricola: " + matricola);
		for(int i = 0; i < esami.length; i++) {
			if(esami[i] != null) {
				System.out.println("- Esame di : " + esami[i].getDocente().getMateria());
				System.out.println("--- Docente : " + esami[i].getDocente().getCognome() + " " + esami[i].getDocente().getNome());
				System.out.println("--- Data : " + esami[i].getData());
				System.out.println("----- Voto : " + esami[i].getVoto());
			}
		}
	}
	
	public boolean aggiungiEsame(Esame esame) {
		if(esame.getVoto() >= 18 && esame.getVoto() <= 31) {
			for(int i = 0; i < esami.length; i++) {
				if(esami[i] == null) {
					esami[i] = esame;
					return true;
				}
			}			
		}
		return false;
	}
	
	public double calcolaMediaVoti() {
		int somma = 0;
		int cont = 0;
		for(int i = 0; i < esami.length; i++) {
			if(esami[i] != null) {
				somma = somma + esami[i].getVoto();
				cont++;
			}
		}
		return somma/cont;
		
	}
	
	private String generaMatricola() {
		this.matricolaCounter++;
		String mat = "IT";
		for(int i = 0; i < nome.length(); i++) {
			char carattere = nome.charAt(i);
			if(carattere == 'a' ||carattere == 'e' ||carattere == 'i' ||carattere == 'o' ||carattere == 'u' ) {
				continue;
			}else {
				mat = mat + carattere;
			}
		}
		mat = mat + matricolaCounter;
		return mat;
	}

}
