/* 
	Este es un comentario de
	varias líneas
*/

public class EjemploArrays{


	public static void main(String[] args){
		int[] ages = {10, 15, 9, 13};
		//printArray(ages);
		
		ages[0] = 11;

		//printArray(ages);
		findElement(ages, 15);
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

	public static void findNegative(int [] number, string negative){
		for(int current : number){
			if(current == negative){
			   	System.out.println(negative + " founded!");
			   	break;
			}else(current != negative){
				System.out.println("all positive")
			}		

		}	
	}

}
