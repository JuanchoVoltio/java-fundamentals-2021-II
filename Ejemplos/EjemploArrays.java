/* 
	Este es un comentario de
	varias líneas
*/

public class ArraysGregoryNieto{


	public static void main(String[] args){
		int[] ages = {10, 15, 6, 13};
		String[] names = {"José", "Juan", "Cenidier", "Jeison", "Diego", "William", "Henry"};
		String[] cities = {"Bogotá", "Santo Domingo", "Buenos Aires", "Londres", "Oslo"};
		printArray(ages);
		
		ages[0] = 11;

		printArray(ages);
		printNegativeIndexElement(names, -7);
		printNegativeIndexElement(cities, -7);
	}


	public static void printLastElement(String[] array){
		int lastIndex = array.length - 1;
		System.out.println(array[lastIndex]);
	}

	public static void printFirstElement(String[] array){
		System.out.println(array[0]);
	}


	//TODO: [1] Hacer segura esta función usando condicionales
	public static void printNegativeIndexElement(String[] array, int negativeIndex){
		int index = array.length + negativeIndex;
		System.out.println(array[index]);
	}

	public static void printArray(int[] array){
		for(int current : array){ // for current in array:
			System.out.println(current);	
		}
		System.out.println("--------");
	}

	public static void findElement(int[] array, int element){
		//int iterations = 0;		

		for(int current : array){
			//iterations++;
			if(current == element){
				System.out.println(element + " founded!");
				break;
			}
		}

		//System.out.println("I made " + iterations + " iterations");
	}

	//TODO: Agregar una función que indique si hay un número negativo en el arreglo
	public static void findNegative(int[] number){
		int iterations = 0;

		printArray(number);
		
		for(int current : number){
			iterations++;
			if(current < 0){
			   	System.out.println(current + " founded!");
			   	break;
			}		
		}
		
		if(iterations == number.length){
			System.out.println("all positive");
		}
	}

	//TODO: [2] Hacer una función que dado un arreglo de números enteros, calcule el promedio de esos números

}
