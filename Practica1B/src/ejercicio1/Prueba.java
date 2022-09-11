package ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		
		System.out.println("Prueba entre numeros con FOR");
		entreFor e1 = new entreFor();
		e1.imprimirEntre(5,8);
		System.out.print("\n");
		e1.imprimirEntre(15,2);
		System.out.print("\n");
		e1.imprimirEntre(2,2);
		System.out.print("\n");
	
		System.out.println("Prueba entre numeros con WHILE");
		entreWhile e2 = new entreWhile();
		e2.imprimirEntre(5,8);
		System.out.print("\n");
		e2.imprimirEntre(15,2);
		System.out.print("\n");
		e2.imprimirEntre(2,2);
		System.out.print("\n");
		
		System.out.println("Prueba entre numeros con RECURSION");
		entreRecursion e3 = new entreRecursion();
		e3.imprimirEntre(5,8);
		System.out.print("\n");
		e3.imprimirEntre(15,2);
		System.out.print("\n");
		e3.imprimirEntre(2,2);
		System.out.print("\n");
	}
}
