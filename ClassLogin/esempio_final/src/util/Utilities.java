package util;

public class Utilities { //le classi Util contengono solo metodi statici
	public static boolean isMarcaValida(String marca) {
		if(marca.contains("%")) {
			return false;
		}
		return true;
	}
}
