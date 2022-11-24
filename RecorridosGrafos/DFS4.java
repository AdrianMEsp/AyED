/*
Recorrido de un Grafo desde DatoA hasta DatoB pasando por datoC , sin pasar por datoD, con el camino mas
largo pero cuyo peso sea menor a un MaxLimit
*/
package EP;

import ejercicio3.Arista;
import ejercicio3.Grafo;
import ejercicio3.Vertice;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class EP <T>{
	
	public ListaGenerica<T> dfs(
			Grafo<T> grafo,
			T datoA,
			T datoB,
			T pasandoPor,
			T sinPasarPor,
			int maxLimit,
			int minTotal) {
		
		// buscar el vertice que tiene el dato
		Vertice<T> vertice = null;
		ListaGenerica<T> camino = new ListaEnlazadaGenerica<T>();
		ListaGenerica<T> temporal = new ListaEnlazadaGenerica<T>();
		// java inicializa el arreglo de boolean por defecto en false	
		boolean [] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaGenerica vertices = grafo.listaDeVertices();
		vertices.comenzar();
		while(!vertices.fin()) {
			vertice = (Vertice<T>) vertices.proximo();
			if(vertice.dato().equals(datoA)) {
				break;
			}
		}
		int[] maxSuma = {9999999};
		if(vertice!=null) {
			this.dfs_private(
					grafo,
					vertice,
					visitados,
					datoB,
					camino,
					temporal,
					pasandoPor,
					false,
					sinPasarPor,
					maxLimit,
					maxTotal,
					0);
		}
		return camino;
				
	}

	private <T> void dfs_private(
			Grafo<T> grafo,
			Vertice<T> vertice,
			boolean[] visitados,
			T datoB,
			ListaGenerica<T> camino,
			ListaGenerica<T> temporal,
			T pasandoPor,
			boolean encontre,
			T sinPasarPor,
			int maxLimit,
			int maxTotal,
			int suma,
			int []maxSuma) {
		
		visitados[vertice.getPosicion()] = true;
		temporal.agregarFinal(vertice.dato());
	
		//procesar el dato
		if(vertice.dato().equals(pasandoPor))
			encontre = true;
		
		if(vertice.dato().equals(datoB) && encontre && temporal.tamanio()>= camino.tamanio() && suma < maxSuma[0]) {
			
			maxSuma[0] = suma;
			//limpio la lista camino
			camino.comenzar();
			while(!camino.fin()) {
				
				camino.eliminarEn(camino.tamanio());
				camino.proximo();
			}
			
			//actualizo la lista camino con la temporal
			temporal.comenzar();
			while(!temporal.fin())
				camino.agregarFinal(temporal.proximo());
				
		}else {
		
			if(!vertice.dato().equals(datoB)) {
				//llamar recursivamente
				ListaEnlazadaGenerica<Arista<T>> aristas = grafo.listaDeAdyacentes(vertice);
				aristas.comenzar();
				while(!aristas.fin()) {
					Arista <T> arista = aristas.proximo();
					
					if(arista.peso() <= maxLimit) {
						Vertice<T> vDest = arista.verticeDestino();
						if(!visitados[vDest.getPosicion()] &&
								!vDest.dato().equals(sinPasarPor) &&
								suma+arista.peso() < maxTotal)
							
							this.dfs_private(
									grafo,
									vDest,
									visitados,
									datoB, camino, 
									temporal, sinPasarPor, encontre,
									pasandoPor, maxLimit, maxTotal, suma+arista.peso());
							}
					}
			}
		
		}
		
		//ojo con el desmarque que no siempre va
		visitados[vertice.getPosicion()] = false;
		temporal.eliminarEn(temporal.tamanio());
	}	
