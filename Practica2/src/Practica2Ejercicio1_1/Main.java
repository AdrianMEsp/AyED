package Practica2Ejercicio1_1;

public class Main {
	
	public static void main(String[] args) {
		
		int valores[]= new int[] {1,4,7,2,4,8};
		TestListaDeEnterosConArreglos test = new TestListaDeEnterosConArreglos(valores);
		
		String text = test.imprimir();
		System.out.println(text);
	}
}
