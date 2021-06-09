/ * 
	Este es un comentario de
	varias líneas
* /

public  class  ArrayDiaz{


	public  static  void  main (String[]args) {
		int [] ages = { 10 , 15 , 9 , 13 };
		String[] names = {"José", "Juan", "Cenidier", "Jeison", "Diego", "William", "Henry"};
		String[] cities = {"Bogotá", "Santo Domingo", "Buenos Aires", "Oslo",};
		printArray(ages);
		
		ages[0]= 11;

		printArray ages);
		printLastElement(ages);
	}
	
	public static void printLastElement(String [] array){
		int lastIndex = array.length -1;
		System.out.println(array[lastIndex]);	// para recibir el ultimo elemento
	}
	
	public static void printFirstElement(String [] array){
		System.out.println(array[0]);	// para recibir primer elemento
	}
			
	public  static  void  printArray ( int [] array ) {
		for ( int current : array) { // for current in array:
			System.out.println (current);	
		}
		System.out.println( " -------- " );
	}

	public  static  void  findElement ( int [] array , int element ) {
		// int iteraciones = 0;		

		for ( int current : array) {
			// iteraciones ++;
			if ( current == element ) {
				System.out.println (element +  " ¡founded!");
				break ;
			}
		}

		// System.out.println ("I made" + iterations + "iterations");
	}

	// TODO: Agregar una función que indique si hay un número negativo en el arreglo

	public  static  void  findNegative (int [] number) {
		int iteration = 0;
		for ( int current : number) {
			iteration++;
			if (current == negative) {
					System.out.println (negative +  " ¡founded!");
					break;
			}else{
				System.out.println ( "all positive" )
			}		

		}	
		if (iterations == number.length){
			System.out.println ( "all positive" );
		}
		
		}
	

}