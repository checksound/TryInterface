package simple;

public class Quadrato implements Shape {
	
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

}
