package model;

public class Automobile {
	public String colore;
	public boolean alettone;
	public String led;
	public boolean nos;
	
	public Automobile(String colore) {
		this.colore = colore;
		this.led = "non-presente";
		this.alettone = false;
		this.nos = false;
	}
	
	public void stampaInfo() {
		System.out.println("colore: " + colore);
		if(alettone) {
			System.out.println("La macchina ha l'alettone");
		}else {
			System.out.println("La macchina non ha l'alettone");
		}
		System.out.println("led: " + led);
		if(nos) {
			System.out.println("La macchina ha il nos");
		}else {
			System.out.println("La macchina non ha il nos");
		}
		System.out.println("____________________");
	}
}
