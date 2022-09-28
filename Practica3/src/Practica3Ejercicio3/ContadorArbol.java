package Practica3Ejercicio3;

import tp02.ejercicio2.*;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	ArbolBinario<Integer> dato ;
	
	public ContadorArbol(ArbolBinario<Integer> dato) {
		this.dato=dato;
	}
	
	public ListaGenerica<Integer> numeroPares(){
		ListaGenerica<Integer> lista= new ListaEnlazadaGenerica<Integer>();
		/*System.out.println("InOrden");
		contarParesInOrden(lista,dato);*/
		System.out.println("PostOrden");
		contarParesPostOrden(lista,dato);
		return lista;
	}

	private void contarParesInOrden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo()) contarParesInOrden(lista,arbol.getHijoIzquierdo());
		if (arbol.getDato() % 2 ==0) {
			lista.agregarFinal(arbol.getDato());
		}
		if (arbol.tieneHijoDerecho()) contarParesInOrden(lista,arbol.getHijoDerecho());
	}

	private void contarParesPostOrden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo()) contarParesInOrden(lista,arbol.getHijoIzquierdo());
		if (arbol.tieneHijoDerecho()) contarParesInOrden(lista,arbol.getHijoDerecho());
		if (arbol.getDato() % 2 ==0) {
			lista.agregarFinal(arbol.getDato());
		}
	}
	
}
