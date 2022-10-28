package base;

public class HelloWorld {

	public static void main(String[] args) {
		String stringaHello = "Hello World!!";
		System.out.println(stringaHello);
		
		int i = 10;	//sto dichiarando i e le sto dando valore 10
		//int k;	//sto solo dichiarando la mia variabile
		int j = 4;
		j += 3; //equivale a scrivere: j = j + 3; 
		int k = i + j;
		System.out.println(i);
		System.out.println(k);
		
		System.out.println(stringaHello.length()); //length è un metodo, in questo modo posso sapere da quanti caratteri è composta la stringa.
		System.out.println(stringaHello.toUpperCase()); //altro metodo (trasforma tutti i caratteri della stringa in caratteri maiuscoli)
		
		
	}

}
