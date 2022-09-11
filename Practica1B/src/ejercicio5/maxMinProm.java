package ejercicio5;

public class maxMinProm {
	
	public double[] maxMinProReturn(int a[]) {
		double result[]= new double[3];
		double max=-99, min=999, pro=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) max=a[i];
			if (a[i]<min) min=a[i];
			pro+=a[i];
		}
		result[0]=max;
		result[1]=min;
		result[2]=pro/a.length;
		return result;
	}
	
	public void maxMinProParametro(int a[],double r[]) {
		double max=-99, min=999, pro=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) max=a[i];
			if (a[i]<min) min=a[i];
			pro+=a[i];
		}
		pro/=a.length;
		
		r[0]=max;
		r[1]=min;
		r[2]=pro;
	}

	public void maxMinProSin(int a[], Resultados res) {
		double max=-99, min=999, pro=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) max=a[i];
			if (a[i]<min) min=a[i];
			pro+=a[i];
		}
		pro/=a.length;
		res.setMax(max);
		res.setMin(min);
		res.setProm(pro);
	}

}
