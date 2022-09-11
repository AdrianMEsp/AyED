package ejercicio4;

public class Main {
		
	public static void main(String[] args) {
		int a = 1, b = 2;
		Integer c = 3, d = 4;
		swap1(a,b); //este no intercambia nada
		swap2(c,d); //este no intercambia nada 
		System.out.println("a=" + a + " b=" + b) ; //a=1  b=2
		System.out.println("c=" + c + " d=" + d) ; //c=4  d=3
	}

	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}

	public static void swap2 (Integer x, Integer y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
}