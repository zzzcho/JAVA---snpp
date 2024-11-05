package Figura;

public class Triangulo extends Figuras {
	private float base, altura;
	
	//constructor 
	public Triangulo (float b, float h) {
		this.base = b;
		this.altura = h;
		
	}
	public double getArea() {
		return this.base * this.altura / 2;
	}
}
