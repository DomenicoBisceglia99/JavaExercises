package oop;

public class UtenteTest {

	public static void main(String[] args) {
		// sono due oggetti separati ma dello stesso tipo, tutto ciò che questi utenti possono fare è definito dai metodi della classe Utente
		//la classe definisce un oggetto a se stante
		Utente u = new Utente("Domenico", "Bisceglia", "bisceglia.domenico1121@gmail.com", "EHHH VOLEEEVI!!");
		u.stampaDati();
		Utente u2 = new Utente("Gennaro", "Esposito", "sadasdasda@gmail.com", "blablabla");
		u2.stampaDati();
		
		//per restituire un tale valore, devo utilizzare il metodo get
		String s = u2.getNome(); //--> il metodo get preserva l'integrità della classe
		s = "Pippo";
		
		//u2.cognome = "Pluto"; //in questo modo chiunque può modificare i valori all'interno di un oggetto, per evitarlo si usano i modificatori di accesso
		u2.setCognome("Pluto"); //--> perchè in questo modo, noi che abbiamo scritto la classe possiamo inserire dei controlli all'interno dei metodi set
		//i metodi setter impostano nuovi valori all'interno della variabile della classe (per modificare il cognome, devo usare setCognome, stessa cosa per gli altri
		u2.stampaDati();
		
			}

}



//INCAPSULAMENTO --> le variabili sono accessibili solo all'interno della classe.