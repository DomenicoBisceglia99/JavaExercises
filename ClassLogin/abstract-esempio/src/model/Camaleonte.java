package model;

public class Camaleonte extends Animale{

	public Camaleonte(String codice) {
		super(codice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mangia() {
		System.out.println("sono un camaleonte e mangio ragni");
	}
	
}
