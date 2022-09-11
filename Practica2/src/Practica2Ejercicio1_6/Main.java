package Practica2Ejercicio1_6;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Main {
	
	private ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
	
	public  ListaDeEnterosEnlazada calcularSucesion(int n) {
		if (n!= 1) {
			if (n % 2 == 0) {
				n= n/2;
			}else
				n = (n*3)+1;
			
			list.agregarFinal(n);
			calcularSucesion(n);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		
		Main f = new Main();
		int num=6;
		f.list.agregarInicio(num);
		ListaDeEnterosEnlazada l = f.calcularSucesion(num);
		

		l.comenzar();
		while (!l.fin()) {
			System.out.print(l.proximo()+" ");
		}
		
	}		
}