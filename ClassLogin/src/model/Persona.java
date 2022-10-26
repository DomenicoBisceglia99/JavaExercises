package model;

public class Persona {
	public String username;
	public String password;
	
	public Persona(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean tryLogIn(String username, String password) {
		
		if((this.username.equals(username)) && (this.password.equals(password)) && username != null && password != null) {
			return true;
		}
		return false;
	}
}
