package base;

public class TipiPrimitivi {

	public static void main(String[] args) {
		String parola = "ciao";
		int lunghezzaStringa = parola.length();
		System.out.println(lunghezzaStringa);
		
		char iniziale = parola.charAt(parola.length() - 1);
		System.out.println(iniziale);
		
		String parolaInMaiusc = parola.toUpperCase();
		System.out.println(parolaInMaiusc);
	}

}
