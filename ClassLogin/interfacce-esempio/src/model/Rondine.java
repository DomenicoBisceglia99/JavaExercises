package model;

public class Rondine extends Animale implements Volatile{
	public Rondine(String codice) {
		super(codice);
	}
	
	public void mangia() {
		System.out.println("mangio insetti");
	}
	

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Sono una rondine e sto volando");
	}

	
}
