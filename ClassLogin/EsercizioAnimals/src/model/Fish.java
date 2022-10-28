package model;

public class Fish extends Animal implements Pet{
	
	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	private String name;

	
	public String getName() {
		return name;
	}
	

	
	public void play() {
		System.out.println("Sono un pesce e sto giocando");
	}
	
	public void eat() {
		System.out.println("Sono un pesce e sto mangiando mangime");
	}



	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}


	
	
	
}
