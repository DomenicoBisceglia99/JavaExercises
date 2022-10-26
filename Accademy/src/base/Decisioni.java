package base;

public class Decisioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 50;
		if(i == 5) { //il codice contenuto tra le parentesi graffe di questo if viene eseguito solo se i == 5
			System.out.println("La condizione è verificata al primo colpo.");
		}else if(i == 50){//il codice contenuto tra le parentesi graffe di questo if viene eseguito solo se i == 50
			System.out.println("La condizione è verificata al secondo colpo.");
		}else { // questo codice verrà eseguito se i ha un valore diverso da 5
			System.out.println("La condizione non è verificata.");
		}
		
		//questo codice è equivalente al costrutto if qui sopra
		switch(i) {
			case 5:
				System.out.println("La condizione è verificata al primo colpo.");
				break;
			case 50:
				System.out.println("La condizione è verificata al secondo colpo.");
				break;
			default:
				System.out.println("La condizione non è verificata");
				break;
		}
		//condizione verificata se i minore o uguale di 15
		if(i <= 15){
			System.out.println("La condizione è verificata.");
		}
		
		//impostazioni avanzate dell'if
		int k = 14;
		//possiamo utilizzare gli operatori logici(and, or, ...) per controllare più cose con un singolo if
		if(k >= 10 && k <= 20) { //condizione verificata se i è compreso tra 10 e 20
			System.out.println("La condizione è verificata");
		}
		
		
		//esercizietto: riscriviamo il primo if eliminando la clausola else if
		if(i == 5 || i == 50) {
			System.out.println("La condizione è verificata.");
		}else {
			System.out.println("La condizione non è verificata.");
		}
		
		
		
	}

}
