package Practica4Ejercicio5;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {
	

	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa> arbol) {
		int max=0;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		cola.encolar(arbol);
		cola.encolar(null);
		ArbolGeneral<AreaEmpresa> aux;
		int cantidad=0,total=0;
		
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if (aux != null) {
				total = total + aux.getDato().getTardanza();
				System.out.print(aux.getDato().getTardanza()+" ");
				cantidad++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> liHijos = aux.getHijos();
					liHijos.comenzar();
					while(!liHijos.fin()) {
						cola.encolar(liHijos.proximo());
					}
				}
			}
			else {
				System.out.println("--- "+total+" / "+cantidad+" = "+(total/cantidad));
				total = total/cantidad;
				if(total > max) {
					max=total;
				}
				cantidad=0; total=0;
				if(!cola.esVacia()) {
					cola.encolar(null);
	
				}
			}
		}
		return max;
	}

}
