package ejercicio5;

public class Main {

	public static void main(String[] args) {
		
		int valores[] = new int[]{-5,8,5,6,7,8,4,3,77};
		
		maxMinProm x = new maxMinProm();
		
		double r[] = x.maxMinProReturn(valores);
		System.out.println("con Return:");
		System.out.println("	Valor Maximo: "+r[0]+
				"\n	Valor Minimo: "+r[1]+
				"\n	Promedio: "+r[2]
				);
		
		System.out.println("\ncon Parametro:");
		double resultado[]= new double[3];
		x.maxMinProParametro(valores,resultado);
		System.out.println("	Valor Maximo: "+resultado[0]+
				"\n	Valor Minimo: "+resultado[1]+
				"\n	Promedio: "+resultado[2]
				);
		
		Resultados res = new Resultados();
		System.out.println("\nsin Parametro y sin Return:");
		x.maxMinProSin(valores,res); //le paso una clase vacia y la seteo en la misma
		System.out.println("	Valor Maximo: "+res.getMax()+
				"\n	Valor Minimo: "+res.getMin()+
				"\n	Promedio: "+res.getProm()
				);
	}

}
