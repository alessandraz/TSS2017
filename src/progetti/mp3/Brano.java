package progetti.mp3;

public class Brano implements Comparable<Brano>{

	private String artista;
	private String titolo;
	private double durata;
	private String genere;
	private String cd;
	
	
	public Brano(String nomeArtista, String titolo, double durata) {
		this.artista = nomeArtista;
		this.titolo = titolo;
		this.durata = durata;
		this.genere = null;
		this.cd = null;
	}


	public String getArtista() {
		return artista;
	}


	public String getTitolo() {
		return titolo;
	}


	public double getDurata() {
		return durata;
	}


	public String getGenere() {
		return genere;
	}


	public String getCd() {
		return cd;
	}
	
	
	public void setCd(String titoloCD) {
		this.cd = titoloCD;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}


	//per ordine alfabetico
	public int compareTo(Brano other) {
		return titolo.compareTo(other.titolo);
	}

	@Override
	public String toString() {
		return "CD: " + cd + "\nArtista: " + artista + "\nTitolo: " + titolo + "\nGenere: " + genere + "\nDurata: " + durata;

	}
	
	
	
	
}
