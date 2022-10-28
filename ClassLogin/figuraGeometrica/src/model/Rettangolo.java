package model;

public class Rettangolo extends FiguraGeometrica{
	private int larghezza;
	private int altezza;
	
	public Rettangolo(int larghezza, int altezza) {
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	
	public void calcolaArea() {
		System.out.println(larghezza * altezza);
	
	}
	
	public void calcolaPerimetro() {
		System.out.println(altezza * 2 + larghezza * 2); 
	}
	
	public void disegna() {
		for(int row = 1; row <= this.altezza; row++) {
			for(int col = 1; col <= this.larghezza; col++) {
				if(row == 1 || row == altezza || col == 1 || col == larghezza) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
}
