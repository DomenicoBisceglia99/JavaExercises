package model;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk(){
		System.out.println("sto camminando");
	}
	
	public abstract void eat();
	
	
	
}
