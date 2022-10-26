package base;

public class Array {

	public static void main(String[] args) {
		//array è una struttura dati in grado di contenere una serie di elementi, a patto che siano elementi dello stesso tipo.
		String[] auto = new String[10];
		
		auto[0] = "Ferrari";
		System.out.println(auto[0]);
		
		int l = auto.length; //acquisisco la dimensione dell'array
		for(int i = 0; i < l; i++) {
			System.out.println(auto[i]);
		}
		
		int[] numeri = {3, 6, 4, 9};
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		
	
	}

}
