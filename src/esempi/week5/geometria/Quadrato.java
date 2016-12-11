package esempi.week5.geometria;

// il padre di quadrato è rettangolo
public class Quadrato extends Rettangolo {

    private int lato;

    public Quadrato(Punto p, int lato){
        super(p.getX(),p.getY(),lato, lato);
        this.lato = lato;
    }

    @Override
    public int getPerimetro() {
        return this.lato * 4;
    }

    @Override
    public int getArea() {
        return this.lato * this.lato;
        //return Math.pow(this.lato, 2);
    }

	@Override
	public String toString() {
		
		return "In find dei conti sono solo un rettangolo";
	}
    
    
}