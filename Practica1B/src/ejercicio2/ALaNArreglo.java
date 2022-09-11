package ejercicio2;

public class ALaNArreglo {
	int [] arreglo;
	
	public ALaNArreglo (int numero) {
		arreglo = new int[numero];
		arreglo[0]=numero;
		int valor=numero;
		for (int i=1;i<numero;i++) {
			valor+=numero;
			arreglo[i]=valor;
		}
	}
	
	public void imprimirArreglo() {
		for (int i=0;i<arreglo.length;i++) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.println("\nEl arreglo tiene "+arreglo.length+" espacios");
	}
}
