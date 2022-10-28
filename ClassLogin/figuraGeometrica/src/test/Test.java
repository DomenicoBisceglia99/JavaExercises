package test;

import model.FiguraGeometrica;
import model.Quadrato;
import model.Rettangolo;
import model.Circonferenza;

public class Test {
	public static void main(String[] args) {
		FiguraGeometrica c = new Circonferenza(10);
		FiguraGeometrica r = new Rettangolo(6, 10);
		FiguraGeometrica q = new Quadrato(4);
		c.calcolaArea();
		c.calcolaPerimetro();
		r.calcolaArea();
		r.calcolaPerimetro();
		q.calcolaArea();
		q.calcolaPerimetro();
		((Quadrato)q).disegna();
		((Rettangolo)r).disegna();
	}
}
