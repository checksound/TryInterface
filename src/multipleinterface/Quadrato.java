package multipleinterface;

public class Quadrato implements Shape, Drawable {
	
	private double lato;
	
	public Quadrato(double lato) {
		this.lato = lato;
	}

	@Override
	public double perimetro() {
		return 4 * lato;
	}

	@Override
	public double area() {
		return lato * lato;
	}

	@Override
	public void draw() {
		System.out.println("DISEGNO Quadrato lato: " + lato);		
	}

}
