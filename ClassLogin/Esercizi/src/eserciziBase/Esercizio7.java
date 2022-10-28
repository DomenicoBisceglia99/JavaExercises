package eserciziBase;
/*
 * Esercizio 7
Scrivere un programma che ha una variabile n e stampa la tabellina aritmetica di quel numero. Se ad
esempio il numero inserito è 5 le righe visualizzate devono essere
5×1=5
5×2=10
5×3=15
5×4=20
5×5=25
5×6=30
5×7=35
5×8=40
5×9=45
5×10=50
 * */
public class Esercizio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + n*i);
		}
	}

}
