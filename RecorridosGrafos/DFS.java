public class EP{

 public <T> void dfs(GRafo<T> grado, T dato){
  //buscar el vertice que tiene el dato
   Vertice<T> vertice;
   boolean [] visitados = new [grafo.listaDeVertices().tamanio()];
   ListaEnlazadaGenerica<Vertice<T>> vertices = Grafo.listaDeVertices();
   vertices.comenzar();
   while(!vertices.fin()){
    vertices=vertices.proximo;
     if(vertice.dato().equals(dato)){
       break;
     }
   }
   if (vertice != null){
     this.dfs_private(grafo,vertice);
   }
 }

 private void dfs_private(Grafo<T> grado, Vertice<T> vertice; boolean[] visitados){
  //procesar el dato
   System.out.println(vertice.dato());

   //llamar a recurcion
   ListaEnlazadaGenerica<Arista<T>> arista = grafo.listaDeAdyacentes(vertice);
   aristas.comenzar();
   while(!aristas.fin()){
    Arista<T> arista = aristas.proximo();
     Vertice<T> vDest = arista.verticeDestino();
     if(!visitados[vDest.posicion()])
       this.dfs_private(grafo,vDest,visitados);
   }

   visitados[vertice.posicion] = false;
 }
 //linea-55

 ///me faltan lineas aca

 //linea-91
 ColaGenerica<Vertice<T>> cola;
 cola.encolar(vertice);
 cola.enconlar(null);

 while (!cola.esVacia()){
  Vertice<T> vAux=cola.desencolar();
  if(vAux != null){
   System.out.println(vAux.dato());

   ListaEnlazadaGenerica<Arista<T>> aristas = grafo.listaDeAdyacentes(vAux);
   aristas.comenzar();
   while(!aristas.fin()){
    Arista<T> arista = aristas.proximo();
    Vertice<T> vDest = arista.verticeDestino();

    if(!visitados[vDest.posicion()]){
     visitados[vDest.posicion()] = true;
     cola.encolar(vDest);

   }
  }
 }else{
   if (!cola.esVacia()){
    cola.encolar(null);
   }

   //linea-117

 }
