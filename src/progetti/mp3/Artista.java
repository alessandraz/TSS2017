package progetti.mp3;

public class Artista implements Comparable<Artista>{

	private String nomeArtista;
	

	public Artista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}
	
	//per ordine alfabetico
	public int compareTo(Artista other) {
		return nomeArtista.compareTo(other.nomeArtista);
	}

	@Override
	public String toString() {
		return "Nome Artista: " + nomeArtista;
	}
	
	
	
	
}
