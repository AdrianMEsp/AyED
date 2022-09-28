package Practica3Ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRetardo {

	public static void main(String[] args) {
		
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(6);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(g);
		
		RedBinariaLlena red=new RedBinariaLlena(a);
		
		System.out.println(red.retardoReenvio()+" segundos");
		
	}

}
