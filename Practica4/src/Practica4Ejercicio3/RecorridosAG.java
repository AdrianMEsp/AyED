package Practica4Ejercicio3;

import tp02.ejercicio2.*;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;
import tp02.ejercicio3.ColaGenerica;

public class RecorridosAG {
	private ArbolGeneral<Integer> a;
	
	public RecorridosAG() {
		
	}
	
	public RecorridosAG(ArbolGeneral<Integer> arbol) {
		this.a=arbol;

	}
//----------------------------------------------------------------------------------------------------------------------	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, int num){
		ListaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePreOrden(lis,this.a,num);
		return lis;
	}
	
	private void numerosImparesMayoresQuePreOrden(ListaGenerica<Integer> lis, ArbolGeneral<Integer> a2, int num2) {
		if ((a2.getDato() %2==1)&&(a2.getDato()>num2)){
			lis.agregarFinal(a2.getDato());
		}
		if (a2.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> liHijos = a2.getHijos();
			liHijos.comenzar();
			while (!liHijos.fin()) {
				numerosImparesMayoresQuePreOrden(lis,liHijos.proximo(), num2);
			}
		}	
	}
//----------------------------------------------------------------------------------------------------------------------
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden (lis ,a,n);
		return lis;
	}

	public void numerosImparesMayoresQueInOrden(ListaGenerica<Integer> lis ,ArbolGeneral<Integer> a2,int num2) {
		ListaGenerica<ArbolGeneral<Integer>> liHijos = a2.getHijos();
		liHijos.comenzar();
		
		if (!liHijos.esVacia()) {
			numerosImparesMayoresQuePreOrden(lis,liHijos.proximo(),num2);
		}
		if ((a2.getDato() %2==1)&&(a2.getDato()>num2)){
			lis.agregarFinal(a2.getDato());
		}
		while ((!liHijos.fin())&&(!liHijos.esVacia())) {
			numerosImparesMayoresQuePreOrden(lis,liHijos.proximo(), num2);
		}
	}	
//----------------------------------------------------------------------------------------------------------------------
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden  (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden (lis ,a,n);
		return lis;
	}

	public void numerosImparesMayoresQuePostOrden (ListaGenerica<Integer> lis ,ArbolGeneral<Integer> a2,int num2) {
		if (a2.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> liHijos = a2.getHijos();
			liHijos.comenzar();
			while (!liHijos.fin()) {
				numerosImparesMayoresQuePostOrden(lis,liHijos.proximo(), num2);
			}
		}
		if ((a2.getDato() %2==1)&&(a2.getDato()>num2)){
			lis.agregarFinal(a2.getDato());
		}
	}
//----------------------------------------------------------------------------------------------------------------------
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral <Integer> a2, Integer num2){
		ListaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> aux;
		cola.encolar(a2);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if(aux!=null) {
				if ((aux.getDato() %2==1)&&(aux.getDato()>num2)){
					lis.agregarFinal(aux.getDato());
				}
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> liHijos = aux.getHijos();
					liHijos.comenzar();
					while (!liHijos.fin()) {
						cola.encolar(liHijos.proximo());
					}
				}			
			}
			else {
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}	
	return lis;
	}
}
