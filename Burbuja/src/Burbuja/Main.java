package Burbuja;
import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int op,n;
		long tinicio,tfin,tiempo; //VARIABLES PARA DETERMINAR EL TIEMPO DE LA EJECUCION
		//int vector[] = {25,15,34,2,7,85};
		//int array[]= {18,21,8,14,62,20};
		do {
		tinicio=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE INICIO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
		System.out.flush();
		System.out.println("   		BIEMVENIDO AL MENU     ");
		System.out.println("1.) Metodo Burbuja.");
		System.out.println("2.) Metodo Insercion.");
		System.out.println("3.) Metodo Quicksort.");
		System.out.println("4.) Metodo Headsort.");
		System.out.println("5.) Metodo Countingsort.");
		System.out.println("6.) Metodo Radixsort.");
		System.out.println("7.) Salir del programa.");
		System.out.println("Escoja una opcion:");
		op=sc.nextInt();
		switch(op){
		case 1:
			System.out.flush();
			System.out.println("USTED DECIDIO UTILIZAR EL METODO BURBUJA.");
			System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
			System.out.println("Ingrese la dimension del vector a ordenar:");
			n=sc.nextInt();
			int[] arreglo=new int[n];
			//int arreglo = (int) (Math.random()*n)+1;
			for(int x=0;x<arreglo.length;x++) {
				arreglo[x] = (int) (Math.random()*2000)+1;
			}
			System.out.println("Numeros ordenados.");
			OrdenamientoBurbuja o = new OrdenamientoBurbuja();
			o.OrdenamientoBurbuja(arreglo);
			
			for(int i=0; i< arreglo.length;i++) {
				System.out.println(arreglo[i]);
			}
			tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
			tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
			System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 2:
			System.out.flush();
			System.out.println("USTED DECIDIO UTILIZAR EL METODO INSERCION.");
			System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
			System.out.println("Ingrese la dimension del vector a ordenar:");
			n=sc.nextInt();
			int[] vector=new int[n];
			//int arreglo = (int) (Math.random()*n)+1;
			for(int x=0;x<vector.length;x++) {
				vector[x] = (int) (Math.random()*2000)+1;
			}
			System.out.println("Numeros ordenados:");
			Insercion ins = new Insercion();
			ins.Insercion(vector);
			
			for(int i=0; i<vector.length;i++) {
				System.out.println(vector[i]);
			}
			tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
			tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
			System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 3:
			System.out.flush();
			System.out.println("USTED DECIDIO UTILIZAR EL METODO QUICKSORT.");
			System.out.println("Los numeros que se pondran en el arreglo seran aleatorios.");
			System.out.println("Ingrese la dimension del vector a ordenar:");
			n=sc.nextInt();
			int[] array=new int[n];
			//int arreglo = (int) (Math.random()*n)+1;
			for(int x=0;x<array.length;x++) {
				array[x] = (int) (Math.random()*2000)+1;
			}
			System.out.println("Metodo quicksort.");
			Quicksort qui = new Quicksort();
			qui.Quicksort(array, 0, array.length-1);
			
			for(int i=0; i< array.length;i++) {
				System.out.println(array[i]);
			}
			tfin=System.currentTimeMillis();//TOMAMOS LA HORA EN QUE SE FINALIZO EL ALGORITMO Y LO ALMACENAMOS EN UNA VARIABLE
			tiempo=tfin-tinicio;//SE CALCULA LOS MILISEGUNDOS DE DIFERENCIA
			System.out.println("El tiempo de compilacion en milisegundos es: "+tiempo);//SE MUESTRA EN PANTALLA EL TIEMPO DE LA EJECUCION EN MILISEGUNDOS
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 4:
			System.out.flush();
			//headsort
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 5:
			System.out.flush();
			//countingsort
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 6:
			System.out.flush();
			//radixsort
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		case 7:
		System.out.flush();
		System.out.println("Usted decidio salir del programa.");
		System.out.println("");
		new java.util.Scanner(System.in).nextLine();
		System.out.flush();
		break;
		default:
			System.out.println("Esa opcion no esta en el rango especificado.");
			new java.util.Scanner(System.in).nextLine();
			System.out.flush();
		break;
		}
		}while(op!=7);
		
		
	
		
		/*System.out.println("Metodo quicksort.");
		Quicksort qui = new Quicksort();
		qui.Quicksort(array, 0, array.length-1);
		
		for(int i=0; i< array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("Metodo burbuja.");
		OrdenamientoBurbuja o = new OrdenamientoBurbuja();
		o.OrdenamientoBurbuja(arreglo);
		
		for(int i=0; i< arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("Metodo insercion.");
		Insercion ins = new Insercion();
		ins.Insercion(vector);
		
		for(int i=0; i<vector.length;i++) {
			System.out.println(vector[i]);
		}*/
	}

}
