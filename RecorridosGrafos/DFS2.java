public class EP{

 public <T> void dfs(GRafo<T> grado, T dato, T datoB){
  //buscar el vertice que tiene el dato
   Vertice<T> vertice;
   //java inicializa el arreglo de boolean en False por defecto
   boolean [] visitados = new boolean [grafo.listaDeVertices().tamanio()];
   ListaEnlazadaGenerica<Vertice<T>> vertices = Grafo.listaDeVertices();
   vertices.comenzar();
   while(!vertices.fin()){
    vertices=vertices.proximo();
     if(vertice.dato().equals(dato)){
       break;
     }
   }
   if (vertice != null){
     this.dfs_private(grafo,vertice,visitados,datoB,camino,temporal);
   }
 }

 private <T> void dfs_private(
   Grafo<T> grafo,
   Vertices<T> vertice,
   boolean[] visitados,
   T datoB,
   ListaGenerica<T> camino,
   ListaGenerica<T> temporal){
   
   visitados[vertice.getPosicion()] = true;
   temporal.agregarFinal(vertice.dato());
   
   //procesar el dato
   if(vertice.dato().equals(datoB) ){
     camino.comenzar();
     while(!camino.fin()){
      
       camino.eliminarEn(camino.tamanio());
       camino.proximo();
     }
     //actualizo la lista camino con la temporal
     
     temporal.comenzar();
     while(!temporal.fin()){
      camino.agregarFinal(temporal.proximo()); 
     }
      
   }else {
     //llamar recursivamente
     ListaEnlazadaGenerica<Aristas<T>> aristas = grafo.listaDeAdyacentes(vertice);
     aristas.comenzar();
     while(!aristas.fin()){
      Arista<T> arista = aristas.proximo();
      Vertice<T> vDest = arista.verticeDestino();
      if(!visitados[vDest.posicion()])
        this.dfs_private(grafo,vDest,visitados,datoB,camino,temporal);
   }
     
   visitados[vertice.posicion] = false;
   temporal.eliminarEn(temporal.tamanio());
 }
