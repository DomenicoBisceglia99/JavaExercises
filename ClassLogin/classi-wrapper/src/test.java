
public class test {
	public static void main(String[] args) {
		int numero = 10; //semplice primitivo
		//Integer integer = new Integer(10); //eclipse lo barra perchè abbiamo una modalità DEPRECATA
		Integer integer = Integer.valueOf(10);
		Double doubleWrapper = Double.valueOf(10.5);
		
		//nel caso delle classi wrapper esiste un meccanismo chiamato autoboxing:
		Integer iWrapper = 10; //assegno un valore literal intero ad un oggetti, cosa consentita solamente per le classi wrapper. AUTOBOXING
		
		//l'UNBOXING invece è il processo opposto:
		int iPrimitivo = iWrapper; //UNBOXING
		
	}
}
