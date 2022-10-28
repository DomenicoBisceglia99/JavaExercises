package model;

public class Circonferenza extends FiguraGeometrica{
	
	private int raggio;
	
	public Circonferenza(int raggio) {
		this.raggio = raggio;
	}
	
	public void calcolaArea() {
		System.out.println(Math.PI * Math.pow(raggio, 2));
		
	}
	
	public void calcolaPerimetro() {
		System.out.println(2 * Math.PI * raggio);
	}
	
	
}
