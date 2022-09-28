package Practica3Ejercicio3;

import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class TestContadorArbol {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(8);
		
		a.agregarHijoDerecho(b);
		a.agregarHijoIzquierdo(c);
		b.agregarHijoDerecho(d);
		b.agregarHijoIzquierdo(e);
		
		ContadorArbol test = new ContadorArbol(a);
		ListaGenerica<Integer> l = test.numeroPares(); 
		System.out.println(l.toString());
	}

}
