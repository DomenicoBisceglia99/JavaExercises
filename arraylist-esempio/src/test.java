import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		/*ArrayList<String> parole = new ArrayList<>();
		parole.add("ciao");
		parole.add(5);
		parole.add(new Scanner(System.in));
		
		for(Object s: parole) {
			String parola = ((String)s);
			System.out.println(parola);
		}*/
		
		ArrayList<String> parole = new ArrayList<>();
		parole.add("ciao");
		parole.add("5");
		for(String parola: parole) {
			System.out.println(parola);
		}
		
		System.out.println("-------------------------");
		parole.remove(0);
		for(String parola: parole) {
			System.out.println(parola);
		}
		
		System.out.println("-------------------------");
		parole.set(0, "ho modificato l'elemento!!");
		for(String parola: parole) {
			System.out.println(parola);
		}
	}
}
