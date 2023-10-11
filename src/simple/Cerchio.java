package simple;

public class Cerchio implements Shape {

	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double perimetro() {
		
		return 2 * Math.PI * raggio;
	}

	@Override
	public double area() {		
		return raggio * raggio * Math.PI;
	}

}
