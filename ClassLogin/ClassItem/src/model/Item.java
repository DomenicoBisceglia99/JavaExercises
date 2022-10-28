package model;

public class Item {
	public String description;
	public String color;
	public char size;
	public double prize;
	
	public Item() {
		//metodo che si occupa di creare l'oggetto stesso.
		description = "Undefined Descriprion";
		color = "Undefined Color";
		
	}
	
	public void printInfo() {	//stampaInfo --> caller
		System.out.println(description);	//le println sono worker
		System.out.println(color);
		System.out.println(size);
		System.out.println(prize);
		System.out.println("___________");
	}
	public void stampaLunghezzaDescrizione() {
		System.out.println(description.length());
	}
}
