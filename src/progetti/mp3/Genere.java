package progetti.mp3;

public class Genere implements Comparable<Genere> {

	private String genere;
	
	public Genere(String genere) {
		this.genere = genere;
	}

	public String getGenere() {
		return genere;
	}
	
	
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	//per ordine alfabetico
	public int compareTo(Genere other) {
		return genere.compareTo(other.genere);
	}

	@Override
	public String toString(){
		return "Genere: " + genere;
	}
}
