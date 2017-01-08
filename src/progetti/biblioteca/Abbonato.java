package progetti.biblioteca;

public class Abbonato {

	private String cognome;
	private String nome;
	
	public Abbonato(String cognome, String nome) {
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString(){
		return cognome + " " + nome;
	}
	
	
	
}
