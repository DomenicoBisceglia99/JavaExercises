package model;

public class Persona { //public è un modificatore di accesso, l'altro è package private (per poterlo utilizare dobbiamo omettere il modificatore di accesso, significa che la classe può essere utilizzata all'interno del package model)
	//ATTRIBUTI --> per gli attributi ci sono 4 tipi di modificatori di accesso (anche per i metodi)
	public String nome = "UserName";
	public String cognome = "UserSurname";
	public int eta = 100;
	
	//METODI
	public void stampaInfo() {
		//devo inserire qui tutto quello che il metodo deve fare nel momento in cui viene chiamato
		System.out.println("Il nome dell'oggetto di tipo persona su cui hai chiamato il metodo e' : " + this.nome);
		System.out.println("Il cognome dell'oggetto di tipo persona su cui hai chiamato il metodo e' : " + this.cognome);
		System.out.println("L'eta' dell'oggetto di tipo persona su cui hai chiamato il metodo e' : " + this.eta);
	}
}
