package ejercicio5;

import ejercicio3.Arista;
import ejercicio3.Grafo;
import ejercicio3.Vertice;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Caminos {
	private Grafo<String> grafo;
	
	public Caminos(Grafo<String> grafo) {
		this.grafo=grafo;
	}
	
	//***************************************************************************
	
	public ListaGenerica<String> devolverCamino(String ciudad1, String ciudad2){
		Vertice<String> vertice = null;
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		ListaGenerica<String> temporal= new ListaEnlazadaGenerica<String>();
		
		boolean[] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaGenerica<Vertice<String>> vertices = grafo.listaDeVertices();
		
		vertices.comenzar();
		while (! vertices.fin()) {
			vertice = vertices.proximo();
			if (vertice.dato().equals(ciudad1))
				break;
		}
		if (vertice != null) { //significa que encontro desde donde arrancar
			this.devolverCamino_Priv(ciudad2,vertice,visitados,camino,temporal);
		}
		return camino;
	}
	
	private void devolverCamino_Priv(
			String ciudad2,
			Vertice<String> vertice,
			boolean[] visitados,
			ListaGenerica<String> camino,
			ListaGenerica<String> temporal) {
		
		visitados[vertice.getPosicion()] = true;
		temporal.agregarFinal(vertice.dato());
		
		//procesar Dato
		if (vertice.dato().equals(ciudad2)) {
			camino.comenzar();
			while(!camino.fin()) {
				camino.eliminarEn(camino.tamanio());
				camino.proximo();
			}
		
	    //actualizo la lista camino con la temporal
		
			temporal.comenzar();
			while(!temporal.fin()) {
				camino.agregarFinal(temporal.proximo());
			}
		
		}else {
			ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(vertice);
			ady.comenzar();
			while (!ady.fin()) {
				Arista<String> arista = ady.proximo();
				Vertice<String> vDestino = arista.verticeDestino();
				if (!visitados[vDestino.getPosicion()]) {
					devolverCamino_Priv(ciudad2, vDestino, visitados, camino, temporal);
				}
			}
			visitados[vertice.getPosicion()] = false;
			temporal.eliminarEn(temporal.tamanio());
		}
	}
	
	//***************************************************************************
	
	public ListaGenerica<String> devolverCaminoExceptuando(String ciudad1,String ciudad2,ListaGenerica<String> ciudades){
		boolean[] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaEnlazadaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		if ((!ciudades.incluye(ciudad1)) && (!ciudades.incluye(ciudad2))){
			ListaEnlazadaGenerica<String> temporal = new ListaEnlazadaGenerica<String>();
			ListaGenerica<Vertice<String>> vertices = grafo.listaDeVertices();
			vertices.comenzar();
			Vertice<String> vertice=null;
			while (!vertices.fin()) {
				vertice = vertices.proximo();
				if (vertice.dato().equals(ciudad1)) {
					break;
				}
			}
			if (vertice!= null) {
				this.devolverCaminoExceptuando_priv(ciudad2,vertice,visitados,camino,temporal,ciudades);
			}
		}
		return camino;
	}
	
	private boolean devolverCaminoExceptuando_priv(

			String ciudad2,
			Vertice<String> vertice,
			boolean[] visitados,
			ListaEnlazadaGenerica<String> camino,
			ListaEnlazadaGenerica<String> temporal,
			ListaGenerica<String> ciudades) {
		
		visitados[vertice.getPosicion()] = true;
		temporal.agregarFinal(vertice.dato());
		boolean encontre=false;
		//procesar Dato
		
		if (vertice.dato().equals(ciudad2)) {
			camino.comenzar();
			while(!camino.fin()) {
				camino.eliminarEn(camino.tamanio());
				camino.proximo();
			}
			temporal.comenzar();
			while(!temporal.fin()) {
				camino.agregarFinal(temporal.proximo());
			}
			
		}else {
			ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(vertice);
			ady.comenzar();
			while(!ady.fin() && !encontre) {
				Arista<String> arista = ady.proximo();
				Vertice<String> vDestino = arista.verticeDestino();
				if (!visitados[vDestino.getPosicion()] && !ciudades.incluye(arista.verticeDestino().dato())) {
					encontre = this.devolverCaminoExceptuando_priv(ciudad2,vDestino,visitados,camino,temporal,ciudades);
				}
			}		
		visitados[vertice.getPosicion()] = false;
		temporal.eliminarEn(temporal.tamanio());
		}
		return encontre;
	}
	
	//***************************************************************************
	
	public ListaGenerica<String> caminoMasCorto(String ciudad1,String ciudad2){
		boolean[] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaGenerica<String> temporal = new ListaEnlazadaGenerica<String>();
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		ListaGenerica<Vertice<String>> vertices = grafo.listaDeVertices();
		vertices.comenzar();
		Vertice<String> vertice=null;
		while (! vertices.fin()) {
			vertice = vertices.proximo();
			if (vertice.dato().equals(ciudad1))
				break;
		}
		
		if (vertice != null) {
			this.caminoMasCorto_priv(grafo,vertice,ciudad2,visitados,camino,temporal);
		}
		return camino;
	}
	
	private void caminoMasCorto_priv(
		Grafo<String> grafo,
		Vertice<String> vertice,
		String destino,
		boolean[] visitados,
		ListaGenerica<String> camino,
		ListaGenerica<String> temporal) {
		
		visitados[vertice.getPosicion()]=true;
		temporal.agregarFinal(vertice.dato());
		//proceso el dato
		if (vertice.dato().equals(destino) && temporal.tamanio() < camino.tamanio()) {
			//limpio la lista
			camino.comenzar();
			while (! camino.fin()) {
				camino.eliminarEn(camino.tamanio());
				camino.proximo();
			}
			//actualizo la lista camino con la temporal
			temporal.comenzar();
			while(!temporal.fin()) {
				camino.agregarFinal(temporal.proximo());
			}
			
		}else {
			
			if (vertice.dato().equals(destino)) {
				//llamo recursivamente
				
				ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(vertice);
				ady.comenzar();
				while(!ady.fin()) {
					Arista<String> arista = ady.proximo();
					Vertice<String> vDestino = arista.verticeDestino();
					if (!visitados[vDestino.getPosicion()]) {
						this.caminoMasCorto_priv(grafo, vDestino, destino, visitados, camino, temporal);
					}
				}
			}
			
		visitados[vertice.getPosicion()] = false;
		temporal.eliminarEn(temporal.tamanio());
			
		}	
	}
	
	//***************************************************************************
	
	public ListaGenerica<String> caminoSinCargarCombustible(String ciudad1,String ciudad2,int tanqueAuto){
		boolean[] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		Vertice<String> vertice=null;
		if(tanqueAuto != 0) {
			ListaGenerica<Vertice<String>> vertices = grafo.listaDeVertices();
			vertices.comenzar();
			while(! vertices.fin()) {
				vertice = vertices.proximo();
				if (vertice.dato().equals(ciudad1))
					break;
			}
			if (vertices != null) {
				this.caminoSinCargar_priv(vertice,ciudad2,visitados, camino, tanqueAuto);
			}
		}
		
		return camino;
	}
	
	private boolean caminoSinCargar_priv(
			Vertice<String> vertice,
			String destino,
			boolean[] visitados,
			ListaGenerica<String> camino,
			int tanqueAuto) {
		
		boolean encontre=false;
		visitados[vertice.getPosicion()] = true;
		
		if (vertice.dato().equals(destino)){
			encontre=true;
		}else {
			ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(vertice);
			ady.comenzar();
			while(! ady.fin()) {
				Arista<String> arista = ady.proximo();
				if (! visitados[arista.verticeDestino().getPosicion()]) {

					if (tanqueAuto-arista.peso() >= 0) 
						encontre = caminoSinCargar_priv(vertice,destino,visitados,camino,tanqueAuto-arista.peso());

				}
			}
			if (!encontre) {
				camino.eliminarEn(camino.tamanio());
				camino.proximo();
			}
		}
		return encontre;
	}
	
	//***************************************************************************
	
	public ListaGenerica<String> caminoConMenorCargaDeCombustible(String ciudad1,String ciudad2, int tanqueAuto){
		int[] minimo = {9999};
		boolean[] visitados = new boolean[grafo.listaDeVertices().tamanio() +1 ];
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		ListaGenerica<String> temporal = new ListaEnlazadaGenerica<String>();
		Vertice<String> vertice=null;
		if (tanqueAuto !=0) {
			ListaGenerica<Vertice<String>> vertices = grafo.listaDeVertices();
			vertices.comenzar();
			while(! vertices.fin()) {
				vertice = vertices.proximo();
				if (vertice.dato().equals(ciudad1)) {
					break;
				}
			}
			if (vertice != null) {
				int carga = tanqueAuto;
				this.caminoConMenorCargaDeCombustible_priv(vertice,ciudad2,visitados,camino,temporal,tanqueAuto,0,carga,minimo);
			}
		}
		return camino;
	}
	
	private void caminoConMenorCargaDeCombustible_priv(
			Vertice<String> vertice,
			String destino,
			boolean[] visitados,
			ListaGenerica<String> camino,
			ListaGenerica<String> temporal,
			int tanqueAuto,
			int cant,
			int carga,
			int[] minimo) {

		
		if (vertice.dato().equals(destino)) {
			if(cant < minimo[0]) { //SI ES EL MINIMO DE CARGAS CLONO EL CAMINO Y AHORA PASA A SER EL MINIMO
				//limpio la lista
				camino.comenzar();
				while (! camino.fin()) {
					camino.eliminarEn(camino.tamanio());
					camino.proximo();
				}
				//actualizo la lista camino con la temporal
				temporal.comenzar();
				while(!temporal.fin()) {
					camino.agregarFinal(temporal.proximo());
				}
				minimo[0]=cant;
			}
		}else {
			if (tanqueAuto == 0) {
				tanqueAuto += carga-tanqueAuto;
				cant++;
			}
			visitados[vertice.getPosicion()]=true;
			ListaGenerica<Arista<String>> ady=grafo.listaDeAdyacentes(vertice);
			ady.comenzar();
			while (! ady.fin()) {
				Arista<String> arista = ady.proximo();
				if (! visitados[vertice.getPosicion()]) { //si no esta visitado
					
//RESTO LO QUE VOY A GASTAR DE COMBUSTIBLE y VERIFICO QUE NO ME VOY A QUEDAR SIN COMBUSTIBLE EN EL MEDIO DE LA RUTA
					if (tanqueAuto-arista.peso() >=0 ) { 
						camino.agregarFinal(vertice.dato());
						caminoConMenorCargaDeCombustible_priv(vertice,destino,
								visitados,camino,temporal,
								tanqueAuto-arista.peso(),cant,
								carga,minimo);
					}
				}
			}
		}
	}
	
	
	//***************************************************************************
		
}
	
