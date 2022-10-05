package Practica4Ejercicio3;

import tp02.ejercicio2.*;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;

public class TestRecorridos {

	public static void main(String[] args) {
		ListaGenerica<ArbolGeneral<Integer>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		
		f.agregarHijo(h);
		f.agregarHijo(i);
		
		g.agregarHijo(j);
		
		lista.agregarFinal(c);
		lista.agregarFinal(d);
		lista.agregarFinal(e);
		
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(13,lista);

		
		lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		lista.agregarFinal(b);
		lista.agregarFinal(f);
		lista.agregarFinal(g);
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(11,lista);
		
		
		RecorridosAG test = new RecorridosAG(a);

//----------------------------------------------------------------------------------------------------------------------
		ListaGenerica <Integer> listaDatos = test.numerosImparesMayoresQuePreOrden(a,6);
		System.out.println("PREORDEN: " + listaDatos+"\n");
//----------------------------------------------------------------------------------------------------------------------
		listaDatos = test.numerosImparesMayoresQueInOrden(a, 6);
		System.out.println("INORDEN: "+listaDatos+"\n");
		
//----------------------------------------------------------------------------------------------------------------------
		listaDatos = test.numerosImparesMayoresQuePostOrden(a, 6);
		System.out.println("POSTORDEN: "+listaDatos+"\n");
//----------------------------------------------------------------------------------------------------------------------
		listaDatos = test.numerosImparesMayoresQuePorNiveles(a, 6);
		System.out.println("PORNIVELES: "+listaDatos+"\n");
		
		
	}

}
