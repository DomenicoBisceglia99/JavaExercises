package model;

public class Azienda {
	private String nome;
	private Dipendente[] dipendenti;
	
	public Azienda(String nome) {
		this.nome = nome;
		dipendenti = new Dipendente[30]
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Dipendente[] getDipendenti() {
		return dipendenti;
	}
	
	public void aggiungiDipendente(Dipendente dipendente) {
		for(int i = 0; i < dipendenti.length; i++) {
			if(dipendenti[i] == null) {
				dipendenti[i] = dipendente;
				break;
			}
		}
	}
	
	public void rimuoviDipendente(int indice) {
		if(dipendenti[indice] != null) {
			dipendenti[indice] = null;
		}else {
			System.out.println("Non esiste nessun dipendente salvato all'indice richiesto.");
		}
	}
	
	public void listaDipendenti() {
		for(int i = 0; i < dipendenti.length; i++) {
			if(dipendenti[i] != null) {
				System.out.println(dipendenti[i].toString());
			}
		}
	}
	
	
}
