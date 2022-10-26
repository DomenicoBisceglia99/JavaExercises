package eserciziBase;

public class Esercizio7bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * tabelline dei numeri da 1 a 10
 * */
		for(int i = 1; i <= 10; i++) {
			System.out.println("___Tabellina del " + i + ":___");
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}

}
