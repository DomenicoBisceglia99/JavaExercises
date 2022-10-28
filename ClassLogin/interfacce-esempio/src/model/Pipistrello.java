package model;

public class Pipistrello extends Animale implements Volatile{
	public Pipistrello(String codice) {
		super(codice);
	}
	
	public void mangia() {
		System.out.println("mangio insetti");
	}

	
	public void metodoConCorpo() {
		System.out.println("metodo ereditato da volatile e sovrascritto opzionalmente");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Sono un pipistrello e sto volando");
	}
	
	//andare a riscrivere metodoConCorpoStatic signifa fare un Hiding, non un Override
	
	
}
