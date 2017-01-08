package progetti.mp3;

import java.util.ArrayList;

public class CD implements Comparable<CD> {
	
	private String titolo;
	private String artista;
	private ArrayList <Brano> braniCD;
	private Genere genere;
	private double durata;
	
	
	public CD (String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
		this.braniCD = new ArrayList<Brano>();
		this.genere = genere;
		this.durata = durata;
	}


	public String getTitolo() {
		return titolo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public ArrayList<Brano> getBraniCD() {
		return braniCD;
	}


	public Genere getGenere() {
		return genere;
	}


	public double getDurata() {
		return durata;
	}

	//per ordine alfabetico
	public int compareTo(CD other) {
		return titolo.compareTo(other.titolo);
	}

	@Override
	public String toString() {
		return "Titolo: " + titolo + "\nArtista: " + artista +  "\nGenere: " + genere + "\nDurata: " + durata;
	}
	
	
	
	
	
}
