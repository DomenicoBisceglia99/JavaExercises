package model;

public class Aula {
	private Studente[] studenti = new Studente[20];
	private Docente docente;
	
	public Aula(Docente docente) {
		this.docente = docente;
	}

	public Studente[] getStudenti() {
		return studenti;
	}

	public void setStudenti(Studente[] studenti) {
		this.studenti = studenti;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	public void aggiungiStudente(Studente studente) {
		boolean giaPresente = false;
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] != null) {
				if((studenti[i].getNome() == studente.getNome()) || (studenti[i].getCognome() == studente.getCognome())){
					giaPresente = true;
					break;
				}
			}
		}
		if(!giaPresente) {
			for(int i = 0; i < studenti.length; i++) {
				if(studenti[i] == null) {
					studenti[i] = studente;
					break;
					//System.out.println(studenti[i].getNome());
				}
			}
		}
		
	}
	
	public void rimuoviStudente(String nome, String cognome) {
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] != null) {
				if(studenti[i].getNome() == nome && studenti[i].getCognome()==cognome) {
					studenti[i]=null;
				}
			}
		}
	}
	
	public double calcolaMediaVoti() {
		int somma = 0;
		int cont = 0;
		for(int i = 0; i < studenti.length; i++) {
			Esame[] voti = new Esame[10];
			if(studenti[i] != null) {
				voti = studenti[i].getEsami();
				for(int j = 0; j < voti.length; j++) {
					if(voti[j] != null) {
						somma = somma + voti[j].getVoto();
						cont++;
					}else {
						
					}
					
				}
			}
		}
		return somma/cont;
	}
	
	public double calcolaNumeroEsami() {
		int cont = 0;
		//System.out.println(studenti.length);
		for(int i = 0; i < studenti.length; i++) {
			//System.out.println(i);
			Esame[] esami = new Esame[10];
			//System.out.println(cont);
			if(studenti[i] != null) {
				esami = studenti[i].getEsami();
				//System.out.println(studenti[i].getNome());
				for(int j = 0; j < esami.length; j++) {
					if(esami[j] != null) {
						cont++;
					}
				}
			}
		}
		return cont;
	}
	
	
}
