package Practica2Ejercicio1_3;

public class Main {

	public static void main(String[] args) {
		
		int valores[] = new int[] {1,2,8,7,5,1};
		
		TestListaDeEnterosEnlazada lista = new TestListaDeEnterosEnlazada(valores);

		String text=lista.imprimir();
		System.out.println(text);

	}

}
