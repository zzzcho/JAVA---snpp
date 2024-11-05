package practicas;

import java.util.Scanner;

public class PracticaUno {
	public static void main (String [] args) {
	int edad;
	String nombre;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingrese su nombre: ");
	nombre = sc.next();
	System.out.println("Ingrese su edad: ");
	edad = sc.nextInt();
	
	
	if (edad >= 18 && edad <=90) {
		System.out.println(" " +nombre + " Eres mayor de edad");
	}else if (edad < 18 && edad > 0) {
		System.out.println(" " +nombre + "Eres menor de edad");
	}else {
		System.out.println("Los datos ingresados son erroneos");
	}

 }

}
