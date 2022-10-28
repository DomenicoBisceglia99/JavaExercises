package model;

public class Grafico extends Dipendente{
	private double bonus;
	private String specializzazione;
	
	public Grafico(String nome, String cognome, double stipendio, String specializzazione) {
		super(nome, cognome, stipendio);
		this.bonus = 200;
		this.specializzazione = specializzazione;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nbonus : " + bonus + " specializzazione : " + specializzazione;
	}
	
	public void lavora() {
		System.out.println("Il dipendente è un grafico.");
	}
	
	
}
