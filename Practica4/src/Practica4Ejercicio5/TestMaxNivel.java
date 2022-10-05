package Practica4Ejercicio5;

import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;

public class TestMaxNivel {

	public static void main(String[] args) {
		
		AreaEmpresa dato=new AreaEmpresa("M",14);
		ArbolGeneral<AreaEmpresa> m = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato=new AreaEmpresa("J",13);
		ArbolGeneral<AreaEmpresa> j = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("K",25);
		ArbolGeneral<AreaEmpresa> k = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("L",10);
		ArbolGeneral<AreaEmpresa> l = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato=new AreaEmpresa("A",4);
		ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("B",7);
		ArbolGeneral<AreaEmpresa> b = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("C",5);
		ArbolGeneral<AreaEmpresa> c = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato=new AreaEmpresa("D",6);
		ArbolGeneral<AreaEmpresa> d = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("E",10);
		ArbolGeneral<AreaEmpresa> e = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("F",18);
		ArbolGeneral<AreaEmpresa> f = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato=new AreaEmpresa("G",9);
		ArbolGeneral<AreaEmpresa> g = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("H",12);
		ArbolGeneral<AreaEmpresa> h = new ArbolGeneral<AreaEmpresa>(dato);
		dato=new AreaEmpresa("I",19);
		ArbolGeneral<AreaEmpresa> i = new ArbolGeneral<AreaEmpresa>(dato);
		
		m.agregarHijo(j);
		m.agregarHijo(k);
		m.agregarHijo(l);
		
		j.agregarHijo(a);
		j.agregarHijo(b);
		j.agregarHijo(c);
		
		k.agregarHijo(d);
		k.agregarHijo(e);
		k.agregarHijo(f);
		
		l.agregarHijo(g);
		l.agregarHijo(h);
		l.agregarHijo(i);
		
		AnalizadorArbol analize = new AnalizadorArbol();
		
		System.out.println("\nEl promedio maximo de tardanza es: "+analize.devolverMaximoPromedio(m));

	}

}
