package progetti.negozio;

import java.util.ArrayList;

public class Negozio {

	private String nome;
	private String nomeNegoziante;
	private String indirizzo;
	private String telefono;
	private String sito;
	private double incasso;
	private ArrayList <Prodotto> prodotti;
	
	public Negozio(String nome, String nomeNegoziante) {
		this.nome = nome;
		this.nomeNegoziante = nomeNegoziante;
		this.prodotti = new ArrayList();
	}

	//getters & setters
	public String getNome() {
		return nome;
	}

	public String getNomeNegoziante() {
		return nomeNegoziante;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSito() {
		return sito;
	}

	public void setSito(String sito) {
		this.sito = sito;
	}

	public double getIncasso() {
		return incasso;
	}

	public void setIncasso(double incasso) {
		this.incasso = incasso;
	}
	
	//metodi
	public void aggiungiProdotto(Prodotto prodotto){
		prodotti.add(prodotto);
	}
	
	public void elencaProdotti(){
		int i = 0;
		for (Prodotto prodotto : prodotti) {
			System.out.println(i + ") " + prodotto.getNome() + " " + prodotto.getPrezzo());
			i++;
		}
	}
	
	public void vendiProdotto(int pos) {
			
		Prodotto p = prodotti.get(pos);
		incasso = incasso + p.getPrezzo();
		
		prodotti.remove(pos);
		System.out.println("Hai acquistato " + p.getNome());
		

		}	
}
