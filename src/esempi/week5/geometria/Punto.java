package esempi.week5.geometria;

public class Punto {
	
	//realizzo incapsulamento
	private int x;
	private int y;
	private static int conteggio = 0;
	
	//metodo costruttore, non è più disponibile il costruttore di default
	public Punto(int x, int y){
		//this proprietà dell'oggetto corrente
		//4 punti sono 4 oggetti --> 4 valori per x e 4 per y
		this.x = x;
		this.y = y;
		this.conteggio++;
	}
	
	public static int getConteggio() {
		return conteggio;
	}

	public int getX() {
		//posso fare altre operazioni prima del return
		return x;
	}

	public void setX(int x) {
		//dovrei fare altre operazioni
		this.x = x;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
    public String toString() {


        String risposta = "(" + this.getX()
                + ", " + this.getY() + ")";

        //return super.toString();
        return risposta;
    }
	
	
	
	
}
