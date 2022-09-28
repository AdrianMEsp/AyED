package Practica3Ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	ArbolBinario<Integer> arbol;
	
	public RedBinariaLlena(ArbolBinario<Integer> arbol) {
		this.arbol=arbol;
	}
	
	public int retardoReenvio() {		
		return retardoReenvio(arbol);
	}

	public int retardoReenvio(ArbolBinario<Integer> arbol) {
		if (arbol.esVacio()) return -1;//arbol vacio
		int cant=-1;
		if (arbol.esHoja()) return arbol.getDato();//arbol donde tiene un solo dato
		
		else {
			if (arbol.tieneHijoIzquierdo()) cant = Math.max(cant,retardoReenvio(arbol.getHijoIzquierdo()));
			
			if (arbol.tieneHijoDerecho()) cant = Math.max(cant,retardoReenvio(arbol.getHijoDerecho()));
		}
		return cant + arbol.getDato();
	}

}
