import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author secuo
 */
public class TrianguloDiaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Triangulo equilatero... Es un triangulo de tres lados iguales
		Triangulo isoceles... Es un triangulo que tiene dos lados iguales 
		Triangulo escaleno... no tiene sus lados iguales*/ 
		Scanner triangulo = new Scanner (System.in);

		int a, b, c;
		System.out.println("Ingrese la primer longitud del primer lado del triángulo: ");
		a = triangulo.nextInt();
		System.out.println("Ingrese la segunda longitud del segundo lado del triángulo: ");
		b = triangulo.nextInt();
		System.out.println("Ingrese la tercera longitud del tercer lado del triángulo: ");
		c = triangulo.nextInt();
	
		if(a==b && a==c && b==c){
			System.out.println("Es un triángulo equilatero.");
		}
		else if (a==b || a==c || b==c){
			System.out.println("Es un triángulo isóceles.");	
		}
		else{
			System.out.println("Es un triángulo escaleno.");
		}
	}	
}