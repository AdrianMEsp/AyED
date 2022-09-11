package ejercicio3;

public class Test {

	public static void main(String[] args) {
		
		Estudiante [] alumnos =  new Estudiante [2];
		Profesor [] profesores = new Profesor [3];
		
		alumnos[0]=new Estudiante("Juan","Tyrlik","2A","jTyrlik@algo.com","Magdalena");
		alumnos[1]=new Estudiante("Pilar","Ardanza","5B","piliArdanza@algo.com","Gonnet");
		
		profesores[0] = new Profesor ("Armando","DeGregorio","armaGrego@algor.com","Politica","UCALP");
		profesores[1] = new Profesor ("Carlos","Di Maria","carloDimar@tute.com","Economia","UNLP FE");
		profesores[2] = new Profesor ("Marta","Friesno","martita@hotmail.com","Psicologia","UNLP HUMANIDADES");
		
		System.out.println("Alumnos Cargados en el Sistema:\n");
		for (int i=0;i<alumnos.length;i++) {
			System.out.println(alumnos[i].tusDatos());
		}
		
		System.out.println("Profesores Cargados en el Sistema:\n");
		for (int i=0;i<profesores.length;i++) {
			System.out.println(profesores[i].tusDatos());
		}
	
	}

}
