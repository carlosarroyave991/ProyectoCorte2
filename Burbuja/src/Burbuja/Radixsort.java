package Burbuja;

public class Radixsort {
	
	public void Radixsort(int[] vecradix) {
		int x,i,j;
		for(x=vecradix.length-1;x>=0;x--) {
			int aux[]=new int[vecradix.length];
			j=0;
			for(i=0;i<=vecradix.length;i++) {
				boolean mover=vecradix[i]<<x>=0;
				if(x==0 ? !mover:mover) {
					aux[j]=vecradix[i];
					j++;
				}else {
					vecradix[i-j]=vecradix[i];
				}
			}
			for(i=j;i<aux.length;i++) {
				aux[i]=vecradix[i-j];
			}
			vecradix=aux;
		}
	System.out.println("El arreglo ordenado con radix.");
	}
}
