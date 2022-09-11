package ejercicio1;

public class entreRecursion {
	
	public entreRecursion() {
	}
	
	public void imprimirRecursivo (int num1,int num2) {
		if (num1 <= num2) {
			System.out.print(num1+" ");
			imprimirRecursivo(++num1, num2);
		}
	}
	
	public void imprimirEntre(int num1,int num2) {
		if (num1 < num2) {
			imprimirRecursivo(num1,num2);
		}
		else {
			imprimirRecursivo(num2,num1);
		}
	}
}
