package classDispositivo;

public class Dispositivo {
	public String descrizione;
	public double altezza;
	public double lunghezza;
	public double larghezza;
	public String marca;
	
	public void printInfo() {
		System.out.println(descrizione);
		System.out.println(altezza);
		System.out.println(lunghezza);
		System.out.println(larghezza);
		System.out.println(marca);
		System.out.println("___________");
	}
	
	public void printDescDim() {
		System.out.println("La descrizione è lunga " + descrizione.length() + " caratteri.");
	}
	
	public void printGreaterDim() {
		//stampa la dimensione maggiore tra altezza, lunghezza e larghezza
		if(altezza > lunghezza && lunghezza > larghezza) {
			System.out.println("La dimensione maggiore è l'altezza, con " + altezza);
		}else if(lunghezza > altezza && lunghezza > larghezza) {
			System.out.println("La dimensione maggiore è la lunghezza con " + lunghezza);
		}else {
			System.out.println("La dimensione maggiore è la larghezza con " + larghezza);
		}
	}
	
	public void printAverageDim() {
		System.out.println( (altezza + lunghezza + larghezza)/3 );
	}
	
}
