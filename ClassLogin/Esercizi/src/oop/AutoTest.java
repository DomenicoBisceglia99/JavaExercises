package oop;

public class AutoTest {

	public static void main(String[] args) {
		Auto a1 = new Auto("Fiat", "bho", "benzina", 230, "spider");
		Auto a2 = new Auto("Ford", "bah", "dieseò", 7000, "coupè");
		
		if(a1.autoSportiva()) {
			System.out.println("sportiva");
		}
		
		if(a2.autoDaCorsa()) {
			System.out.println("da corsa");
		}
		
		
	}

}
