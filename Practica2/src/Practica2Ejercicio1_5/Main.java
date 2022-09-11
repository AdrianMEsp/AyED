package Practica2Ejercicio1_5;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Main {

	public static void main(String[] args) {

		int valores[] = new int[] {2,5,8,22,7,98,33,54};
		
		ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
		list.agregarInicio(valores[0]);
		list.agregarInicio(valores[1]);
		list.agregarInicio(valores[2]);
		list.agregarInicio(valores[3]);
		list.agregarInicio(valores[4]);
		list.agregarInicio(valores[5]);
		list.agregarInicio(valores[6]);
		list.agregarInicio(valores[7]);
		
		int x=0;
		imprimir(list,x);
	}

	public static void imprimir(ListaDeEnterosEnlazada list, int pos) {
		if (list.tamanio()==0) {
			System.out.println("Error - Lista vacia");
		}
		else {
			System.out.println("Imprimir Inverso");
			imprimirRecursivoInverso(list, 0);
			System.out.println("\nImprimir en Orden");
			imprimirRecursivo(list, 0);
		}
	}
	
	
	public static void imprimirRecursivoInverso(ListaDeEnterosEnlazada list,int pos) {
		if (pos<list.tamanio()) {
			String dato = java.lang.Integer.toString(list.elemento(++pos));
			System.out.print(dato+" ");
			imprimirRecursivoInverso(list,pos);
		}
	}
	public static void imprimirRecursivo(ListaDeEnterosEnlazada list, int pos) {
		if (pos<list.tamanio()) {
			imprimirRecursivo(list,++pos);
			String dato = java.lang.Integer.toString(list.elemento(pos));
			System.out.print(dato+" ");
		}
	}
}
