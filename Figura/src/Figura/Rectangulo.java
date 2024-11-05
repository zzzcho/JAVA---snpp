package Figura;

public class Rectangulo extends Figuras {
	private float lado, ancho;
	
	//constructor
	public Rectangulo (float l, float a) {
		this.lado = l;
		this.ancho = a;
	}
	public double getArea () {
		return this.lado * this.ancho;
	}
	
} 
