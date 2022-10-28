package model;

public abstract class Veicolo {
	public abstract void viaggia();
	
	public void accendi() {
		System.out.println("Sto accendendo il veicolo");
	}
	
	public void spegni() {
		System.out.println("Sto spegnendo il veicolo");
	}
	
}
