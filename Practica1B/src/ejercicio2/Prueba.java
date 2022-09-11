package ejercicio2;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in); //para ingresar por teclado
		System.out.println("Ingrese un numero para realizar la tabla de multiplos");
		ALaNArreglo a = new ALaNArreglo(s.nextInt());
		a.imprimirArreglo();	
	}

}
