package Calculadoras;

public class CalculadoraCientifica extends CalculadoraSimple{
	
	String historial;
	
	public CalculadoraCientifica() {
		super();
		this.historial = "Inicio ";
	}
	
	public double getPotencia() {
		float base = super.num1;
		float exponente = super.num2;
		super.resultado = Math.pow(base, exponente);
		this.historial += " " +base + "E" +exponente + " = " + super.resultado;
		return super.resultado;
	}

}
