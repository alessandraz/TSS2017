package progetti.banca;

import java.util.Scanner;

public class Utente {

	private String userName = "Mario";
	private String defaultPassword = "Mario123456";
	private String password;
	
	
	public Utente(String userName, String password){
		this.userName = userName;
		this.password = password;	
	}
	
	public Utente(){
		
	}
	
	//controllo password
	public String checkPassword(){
		if(this.password.equals(defaultPassword)){
			System.out.println("Benvenuto " + userName);
		} else {
			System.out.println("password errata");
		}
		
		return password;
	}
	
	//get name
	public String ottieniNome(){
		return userName;
	}
	
	

	
	
	
	
	
	
	
}
