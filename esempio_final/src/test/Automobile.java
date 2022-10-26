package test;

public class Automobile {
	public String marca;
	public String modello;
	public static int nRuote = 4; //--> le costanti devono essere sempre inizializzate con un valore nel momento in cui vengono dichiarate, altrimenti il programma non compila!!
	//quando dichiaro una variabile statica, essa può essere usata in un contesto statico che un contesto d'istanza
	public Automobile(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}
	
	public void stampaInfo() {
		System.out.println(marca);
		System.out.println(modello);
		System.out.println(nRuote);
	}
	
	public static void modificaNruote(int nRuoteNuovo) {
		nRuote = nRuoteNuovo;
	}
}
