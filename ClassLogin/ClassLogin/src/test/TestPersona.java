package test;
import model.Persona;
import java.util.Scanner;

public class TestPersona {
	public static void main(String[] args) {
		
		Persona p = new Persona("BiscegliaDomenico", "Ciao.!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci Username : ");
		String user = input.nextLine();
		System.out.println("Inserisci password per " + user + " : ");
		String pwd = input.nextLine();
		
		if(p.tryLogIn(user, pwd)) {
			System.out.println("LogIn effettuato con successo!");
		}else {
			System.out.println("mail o password errata!!!!");
		}
		
	}
}
