package multipleinterface;

public class Rettangolo implements Shape, Drawable {

	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double perimetro() {		
		return 2 * (base + altezza);
	}

	@Override
	public double area() {		
		return base + altezza;
	}

	@Override
	public void draw() {
		System.out.println("DISEGNO RETTANGOLO base: " + base + 
				", altezza: " + altezza);		
	}

}
