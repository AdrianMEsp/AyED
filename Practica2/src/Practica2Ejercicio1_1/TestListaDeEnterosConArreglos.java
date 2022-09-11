package Practica2Ejercicio1_1;

import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {
	ListaDeEnterosConArreglos list= new ListaDeEnterosConArreglos();
	
	public TestListaDeEnterosConArreglos(int []valores ) {
		list.comenzar();
		for (int i=0;i<valores.length;i++) {
			//System.out.println("Valor a Agregar:"+valores[i]);
			list.agregarEn(valores[i], i+1);
//puse list.agregarEn(valores[i], i+1) con i+1 porque sino no me dajaba guardar el primer valor
		}
	}
	
	public String imprimir() {
		String texto="";
		if (list.esVacia()) {
			texto.concat("Lista de Enteros vacia");
		}
		else {
			int tamano=list.tamanio();
			//System.out.println("Tamaño de la lista: "+tamano);
			for (int i=1; i<=tamano ;i++) {
				String dato=java.lang.Integer.toString(list.elemento(i));
				texto+=dato+" ";
			}
		}
		return texto;
	}
	
}