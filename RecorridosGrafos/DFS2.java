public class EP{

 public <T> void dfs(GRafo<T> grado, T dato){
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
     this.dfs_private(grafo,vertice,visitados);
   }
 }
