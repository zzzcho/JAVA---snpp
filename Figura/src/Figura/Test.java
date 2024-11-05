package Figura;

public class Test {
	public static void main (String [] args) {
		
		Cuadrado c;
		Rectangulo r;
		Triangulo t;
		
		c = new Cuadrado (10);
		r = new Rectangulo (10, 5);
		t = new Triangulo (10, 5);
		
		System.out.println("El area del Cuadrado es: " + c.getArea());
		System.out.println("El area del Rectangulo es: " + r.getArea());
		System.out.println("El area del Triangulo es: " + t.getArea());
		
		}
	
}
