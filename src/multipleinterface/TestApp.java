package multipleinterface;

public class TestApp {

	private static void stampaValori(Shape shape) {
		double perimetro = shape.perimetro();
		double area = shape.area();
		
		System.out.printf("Perimetro %f - Area %f\n", perimetro, area);
		
	}
	
	private static void drawShape(Drawable drawable) {
		drawable.draw();
	}
	
	public static void main(String[] args) {
		
		Cerchio cerchio = new Cerchio(5);
		Quadrato quadrato = new Quadrato(3);
		Rettangolo rettangolo = new Rettangolo(3, 2);
			
		stampaValori(cerchio);
		stampaValori(quadrato);
		stampaValori(rettangolo);	
		
		drawShape(cerchio);
		drawShape(quadrato);
		drawShape(rettangolo);		
		
	}

}
