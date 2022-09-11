package ejercicio1;

public class entreWhile {

	public entreWhile() {
	}
	
	public void imprimirEntre(int num1, int num2) {
		if (num1 < num2) {
			while (num1 <= num2) {
				System.out.print(num1+" ");
				num1++;
			}
		}
		else {
			while (num2 <= num1) {
				System.out.print(num2+" ");
				num2++;
			}
		}
		
	}
}
