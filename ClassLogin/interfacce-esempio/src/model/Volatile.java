package model;

public interface Volatile {
	
	public /*static final*/ int ATTRIBUTO = 10;
	
	public /*abstract*/ void vola(); //è considerato abstract di default
	
	public default void metodoConCorpo() {	//se tolgo come default, lo conta come abstract
		System.out.println("metodo volatile d'istanza");
	}
	
	public static void metodoConCorpoStatic() {
		System.out.println("medoto volatile di classe");
	}
	
	private void metodoConCorpoDaUsareDentroLInterfaccia() { //metodo che non viene ereditato, perchè è privato. Utilizzabile solo da altri metodi all'interno dell'interfaccia
	
	}
	
}
