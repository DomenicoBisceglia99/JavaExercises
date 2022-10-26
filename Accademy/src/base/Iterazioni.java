package base;

public class Iterazioni {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {	//la variabile i è chiamata variabile contatore, e la sua esistenza è limitata all'interno del ciclo
			System.out.println("Utente " + i);
		}
		
		for(int i = 5; i >= 0; i --) {
			System.out.println(i);
		}
		
		//un ciclo annidato è un ciclo che sta all'interno di un altro ciclo.
		for(int i = 1; i<=5; i++) {
			for(int k = 1; k<=5; k++) {
				System.out.println("Utente "+ i + " "+ k);
			}
		}
		
		//ciclo while
		int a = 0;
		while(a < 10) { //esegue un'operazione fino a quando la condizione è rispettata
			System.out.println(a);
			a++;
		}
		
		//ciclo do while
		
	}

}
