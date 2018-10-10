package Burbuja;

public class Countingsort {

	
	public void Countingsort(int[] vecounting) {
		int arrayLength = vecounting.length;
        if (arrayLength == 0)
            return;
        int max = vecounting[0], min = vecounting[0];
        for (int i = 1; i < arrayLength; i++) {
            if (vecounting[i] > max)
                max = vecounting[i];
            if (vecounting[i] < min)
                min = vecounting[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < arrayLength; i++)
            count[vecounting[i] - min]++;
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
            	vecounting[j++] = i + min;
	}
	
}







/*private static int range;
	private static int[] counting_Sort(int[] array) {
		int[] values = new int [range+1];
		for(int i = 0; i <= range; i++) 
			values[i] = 0;
		for (int i = 0; i < array.length; i++) {
			values[array[i]]++;
		}
		int[] arr = new int[array.length];
		int k = 0;
		for(int i = 0; i <= range; i++) {
			for(int j = 0; j < values[i]; j++) {
				arr[k++] = i;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		range = 100;
		int n = 0;
		int numeros;
		System.out.println("Suministre la cantidad de elementos: ");
		n = sc.nextInt();
		int[] arreglo = new int[n];
        Random rnd = new Random();
        System.out.println("Numeros Aleatorios ");
        for (int i = 0; i < arreglo.length; i++) {
            numeros = rnd.nextInt(99)+1;
            arreglo[i] = numeros;
        	System.out.println(arreglo[i] + " ");
        }
        System.out.println("Numeros Ordenados ");
		arreglo = counting_Sort(arreglo);
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i] + " ");
		}
	}*/

