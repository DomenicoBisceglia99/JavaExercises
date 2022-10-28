package test;
import model.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item();
		Item item2 = item;
		item.printInfo();
		
		item.description = "Camicia";
		item.color = "marrone";
		item.size = 'M';
		item.prize = 900.00;
		
		item2.printInfo();
		
		item = null;
		item2 = null;
		
		int[] numeri = new int[4];
		numeri[0] = 10;

		Item[] items = new Item[4];
		items[0] = new Item();
		
		items[3]= new Item();
		items[3].color = "rosso";
		Item item3 = items[3]; //sto creando una nuova reference nello stack e la sto referenziando.
		//se per caso dovessi fare
		items[3] = null; //--> sto dereferenziando items[3], ma l'oggetto esiste ancora grazie ad item3
		item3 = null; // --> adesso l'oggetto è eliminabile dal garbage collector.
	}

}
