package Calculadoras;

public class CalculadoraSimple {
	
	float num1, num2;
	double resultado;
	
	public CalculadoraSimple() {
		this.num1 = 0;
		this.num2 = 0;
		this.resultado = 0;
	}
	
	public void setNumeros(float n1, float n2) {
		this.num1 = n1;
		this.num2 = n2;
		
	}
	
	public double getSuma() {
		this.resultado = this.num1 + this.num2;
		return this.resultado;
	}

}
