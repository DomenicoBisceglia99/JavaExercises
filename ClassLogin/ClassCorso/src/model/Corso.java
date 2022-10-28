package model;
//overload del metodo rimuovi studente che prende due stringe nome e cognome dello studente da rimuovere dall'array
public class Corso {
	private String nome;
	private Docente docente;
	private Studente[] studenti = new Studente[20];
	
	public Corso(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	public void aggiungiStudente(Studente studente) {
		boolean aggiunto = false;
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] == null) {
				studenti[i] = studente;
				aggiunto = true;
				break;
			}
		}
		if(aggiunto) {
			System.out.println("Studente aggiunto con successo.");
		}else {
			System.out.println("Non c'è più posto per questo studente nel corso.");
		}
	}
	
	public void rimuoviStudente(int indice) {
		if(indice >= 0 && indice <= studenti.length) {
			studenti[indice] = null;
			System.out.println("Studente rimosso con successo!");			
		}else {
			System.out.println("L'indice che hai inserito non è valido!!");
		}
	}
	public void rimuoviStudente(String nome, String cognome) {
		boolean rimosso = false;
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] != null) {
				if(studenti[i].getNome() == nome && studenti[i].getCognome() == cognome) {
					studenti[i] = null;
					rimosso = true;
					break;
				}				
			}
		}
		if(rimosso) {
			System.out.println("Studente rimosso con successo!");
		}else {
			System.out.println("I dati che hai inserito non corrispondono a nessuno studente presente nel corso.");
		}
	}
	
	public void stampaInfo() {
		System.out.println("--------------------------------------------------");
		System.out.println("Nome Corso : " + this.nome);
		this.docente.stampaInfo();
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] != null) {
				studenti[i].stampaInfo();				
			}
		}
		System.out.println("--------------------------------------------------");
	}
	
	public float mediaStudenti() {
		float somma = 0;
		int cont = 0;
		for(int i = 0; i < studenti.length; i++) {
			if(studenti[i] != null) {
				somma = somma + studenti[i].getMediaVoti();
				cont++;
			}
		}
		return somma/cont;
	}
	
}
