package Practica3Ejercicio2;

import tp03.ejercicio1.ArbolBinario;

public class TestEjercicio2 {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(5);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		
		imprimirArbol(a);
		
		System.out.println("\nCantidad de Hojas = "+a.contarHojas());
		System.out.println("Espejo");
		ArbolBinario<Integer> a2 =a.espejo();
		
		imprimirArbol(a2);
		System.out.println("\nEntre niveles");
		a.entreNiveles(0, 1);
	}

	public static void imprimirArbol(ArbolBinario<Integer> arbol) {
		System.out.println(arbol.getDato());
		if (arbol.tieneHijoIzquierdo()) imprimirArbol(arbol.getHijoIzquierdo());
		if (arbol.tieneHijoDerecho()) imprimirArbol(arbol.getHijoDerecho());
	}

}
