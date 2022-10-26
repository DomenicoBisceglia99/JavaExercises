package oop;
/*
 * Creare una classe auto con i seguenti parametri:
 * marca
 * modello
 * alimentazione
 * cavalli
 * tipo
 
 creare la classe AutoTest dove creiamo due oggetti di auto diversi
 
 creiamo un metodo autoSportiva() che restituisce true se l'auto è una spider oppure una coupè. 
 Inoltre creiamo un metodo autoDaCorsa che restituisce true se l'auto è un'auto sportiva eh ha più di 400 cavalli
 */



public class Auto {
	String marca;
	String modello;
	String alimentazione;
	int cavalli;
	String tipo;
	
	//costruttore
	public Auto(String marca, String modello, String alimentazione, int cavalli, String tipo) {
		this.marca         = marca;
		this.modello       = modello;
		this.alimentazione = alimentazione;
		this.cavalli       = cavalli;
		this.tipo          = tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public String getAlimentazione(){
		return alimentazione;
	}
	public int getCavalli() {
		return cavalli;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModello(String modello) {
		
		this.modello = modello;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
		
	}
	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
		
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}
	
	public boolean autoSportiva() {
		 //creiamo un metodo autoSportiva() che restituisce true se l'auto è una spider oppure una coupè. 
		 //Inoltre creiamo un metodo autoDaCorsa che restituisce true se l'auto è un'auto sportiva eh ha più di 400 cavalli
		
		if (this.tipo.equals("spider") || this.tipo.equals("coupè")){
			return true;
		}
		return false;
	}
	
	public boolean autoDaCorsa() {
		if(autoSportiva() && this.cavalli > 400) {
			return true;
		}
		return false;
	}
	
	
}
