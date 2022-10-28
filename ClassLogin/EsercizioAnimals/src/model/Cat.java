package model;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
		
	}
	

	
	public String getName() {
		return name;
	}
	
	public void play() {
		System.out.println("Sono un gatto e sto giocando");
	}
	
	public void eat() {
		System.out.println("Sono un gatto e sto mangiando croccantini");
	}



	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
}
