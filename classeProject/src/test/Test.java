package test;

import model.Persona;

public class Test {

	public static void main(String[] args) {
		Persona p = new Persona("mario");
		Persona p2 = new Persona("giovanni");
		boolean stessoNome = p.equals(p2);
		System.out.println(stessoNome);
		/*
		 * anche se creo due oggetti persona con lo stesso nome, restituisce false, perchè nell'heap abbiamo due reference diverse
		 * */
	
		Persona p3 = new Persona("luca");
		System.out.println(p3); //mi stampa la reference dell'oggetto
	
	}

}
