package test;
import model.Persona;
public class Test {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNome("Domenico");
		p.setCognome("Bisceglia");
		
		String cognomeDellaPersona = p.getCognome();
		String nomeDellaPersona = p.getNome();
	}
}
