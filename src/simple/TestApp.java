package simple;

public class TestApp {

	private static void stampaValori(Shape shape) {
		double perimetro = shape.perimetro();
		double area = shape.area();
		
		System.out.printf("Perimetro %f - Area %f\n", perimetro, area);
		
	}
	
	public static void main(String[] args) {
		
		Shape shapeC = new Cerchio(5);
		Shape shapeQ = new Quadrato(3);
		Shape shapeR = new Rettangolo(3, 2);
			
		stampaValori(shapeC);
		stampaValori(shapeQ);
		stampaValori(shapeR);
		
		// va bene anche così
		stampaValori(new Cerchio(7));
		
		stampaValori(new Quadrato(4));
		
		stampaValori(new Rettangolo(5, 4));
		
		
		

	}

}
