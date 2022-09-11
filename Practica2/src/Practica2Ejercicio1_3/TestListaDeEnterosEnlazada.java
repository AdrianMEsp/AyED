package Practica2Ejercicio1_3;

import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
		
	public TestListaDeEnterosEnlazada(int [] valores) {
		if(valores.length > 0) {
			list.comenzar();
			for (int i=0;i<valores.length;i++) {
				list.agregarFinal(valores[i]);
			}
		}
	}
	
	public String imprimir() {
		String text="";
		if (list.esVacia()) {
			text+="Lista Vacia";
		}
		else {
			int tamano=list.tamanio();
			list.comenzar();
			for(int i=0;i<tamano;i++) {
				String dato=java.lang.Integer.toString(list.proximo());
				text+=dato+" ";
			}
		}
		return text;
	}

}
