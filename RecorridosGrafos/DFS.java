public class EP{

 public <T> void dfs(GRafo<T> grado, T dato){
  //buscar el vertice que tiene el dato
   Vertice<T> vertice;
  //Java inicializa el arreglo de Boolean en False
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
     this.dfs_private(grafo,vertice,visitados);
   }
 }

 private void dfs_private(Grafo<T> grado, Vertice<T> vertice; boolean[] visitados){
  //procesar el dato
   System.out.println(vertice.dato());

   //llamar a recurcion
   ListaEnlazadaGenerica<Arista<T>> aristas = grafo.listaDeAdyacentes(vertice);
   aristas.comenzar();
   while(!aristas.fin()){
     Arista<T> arista = aristas.proximo();
     Vertice<T> vDest = arista.verticeDestino();
     if(!visitados[vDest.posicion()])
       this.dfs_private(grafo,vDest,visitados);
   }

   visitados[vertice.posicion] = false;
 }
