package test;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> listaNomi = new ArrayList<>();
		listaNomi.add("marco");
		listaNomi.add("aldo");
		listaNomi.add("Federica");
		listaNomi.add("Ludovico");
		listaNomi.add("andrea");
		listaNomi.add("Francesco");
		listaNomi.add("filippo");
		listaNomi.add("Giorgio");
		listaNomi.add("Alex");
		
		listaNomi.add(1, "flavia");
		
		for(String nome : listaNomi) {
			System.out.println("Nome: " + nome + " | grandezzaLista: " + listaNomi.size());
		}
		System.out.println("__________________________");
		
		int cont = 0;
		for(String nome : listaNomi) {
			if(nome.charAt(0) == 'F') {
				cont++;
				listaNomi.remove(2);
				System.out.println(nome + " - " + cont);
			}
		}
		
		System.out.println("__________________________");
		cont = 0;
		for(String nome : listaNomi) {
			if(nome.charAt(0) == 'A') {
				cont++;
				System.out.println(nome.toUpperCase() + " - " + cont);
			}
		}
		
	}
}
