package test;

import model.Animal;
import model.Cat;
import model.Pet;
import model.Spider;
import model.Fish;

public class Test {
	public static void main(String[] args) {
		Pet c = new Cat("Nuvola");
		Pet f = new Fish();
		Animal s = new Spider();
		
		c.play();
		f.play();
		s.eat();
		((Cat)c).eat();
		((Fish)f).eat();
		
		
		
		
	}
	
}
