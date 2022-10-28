package model2;

public class Test {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Camaleonte c = new Camaleonte();
		Camaleonte c2 = new Camaleonte();
		Scimmia s = new Scimmia();
		zoo.addAnimale(c);
		zoo.addAnimale(c2);
		zoo.addAnimale(s);
		
		Animale[] animali = zoo.getAnimali();
		for(Animale animale: animali) {
			animale.mangia();
		}
		
		
		//instance of
		Animale a = new Camaleonte();
		a.mangia()
		if(a instanceof Camaleonte) { // --> con instance of riesco a vedere effettivamente di che tipo è l'animale
			
		}
		Camaleonte c3 = ((Camaleonte)a);
		
		
	}
}
