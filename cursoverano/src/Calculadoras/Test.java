package Calculadoras;

public class Test {
	
	public static void main (String [] args) {
		
		CalculadoraSimple CasioSimple;
		CalculadoraCientifica CasioCientifica;
		
		CasioSimple = new CalculadoraSimple();
		CasioCientifica = new CalculadoraCientifica();
		
		CasioSimple.setNumeros(10, 2);
		CasioCientifica.setNumeros(5, 2);
		
		System.out.println("El resultado es: " + CasioSimple.getSuma());
		System.out.println("El resultado es: " + CasioCientifica.getPotencia());
	}

}
