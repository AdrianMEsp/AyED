public <T> void bfs(Grafo<T> grafo, T dato) {
		
		// buscar el vertice que tiene el dato
		Vertice<T> vertice;
		
		// java inicializa el arreglo de boolean por defecto en false	
		boolean [] visitados = new boolean[grafo.listaDeVertices().tamanio() +1];
		ListaEnlazadaGenerica<Vertice<T>> vertices = Grafo.listaDeVertices();
		vertices.comenzar();
		while(!vertices.fin()) {
			vertice = vertices.proximo();
			if(vertice.dato().equals(dato)) {
				break;
			}
		}
		if(vertice!=null) {
			this.bfs_private(grafo, vertice, visitados);
		}
		
	}

	private void bfs_private(Grafo<T> grafo, Vertice<T> vertice, boolean[] visitados) {
		visitados[vertice.posicion()] = true;
	  	ColaGenerica<Vertice<T> cola;
		cola.encolar(vertice);
	 	cola.encolar(null);
	    
	   	while(!cola.esVacia()) {
	    		Vertice<T> vAux = cola.desencolar();
	    		if(vAux != null) {
	    			System.out.println(vAux.dato());
	    			
	    			ListaEnlazadaGenerica<Arista<T>> aristas = grafo.listaDeAdyacentes(vAux);
	    			aristas.comenzar();
	    			while(!aristas.fin()) {
	    				Arista <T> arista = aristas.proximo();
	    				Vertice<T> vDest = arista.verticeDestino();
	    			
	    				if(!visitados[vDest.posicion()]) {
	    					visitados[vDest.posicion()] = true;
	    					cola.encolar(vDest);
	    				}
	    			
	    			}
	    		
	    		}else {
	    			if(!cola.esVacia())
	    				cola.encolar(null);
	    		}
	   	}	
	}
}
