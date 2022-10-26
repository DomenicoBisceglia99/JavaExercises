package model;

public class TestMain {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.stampaInfo();
		
		persona.nome = "Domenico";
		persona.cognome = "Bisceglia";
		persona.eta = 22;
		persona.stampaInfo();
		
		Persona persona2 = new Persona();
		persona2.stampaInfo();
	}

}
