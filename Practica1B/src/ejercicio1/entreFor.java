package ejercicio1;

public class entreFor {
	
	public entreFor() {
	}
	
	public void imprimirEntre(int num1,int num2) {
		if (num1 < num2) {
			for (int i=num1;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}
		else {
			for (int i=num2;i<=num1;i++) {
				System.out.print(i+" ");
			}
		}
	}
}