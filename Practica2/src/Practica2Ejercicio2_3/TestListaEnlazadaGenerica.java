package Practica2Ejercicio2_3;

import ejercicio3.Estudiante;
import tp02.ejercicio2.*;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Juana","Garcia","2A","juanaGarcia@gmail.com","una calle");
		Estudiante e2 = new Estudiante("Carlos","Tamaco","4A","carlosTamaco@gmail.com","me separa");
		Estudiante e3 = new Estudiante("Marcos","Elordi","3B","mElordi@gmail.com","del amor");
		Estudiante e4 = new Estudiante("Pili","Ardanza","8B","pilili@gmail.com","que esta en mis sueños");
		
		ListaEnlazadaGenerica<Estudiante> lisGene = new ListaEnlazadaGenerica<Estudiante>();
		
		lisGene.agregarFinal(e1);
		lisGene.agregarFinal(e2);
		lisGene.agregarFinal(e3);
		lisGene.agregarFinal(e4);
		
		while (!lisGene.fin()) {
			System.out.println(lisGene.proximo().tusDatos());
		}
		
	}
}
