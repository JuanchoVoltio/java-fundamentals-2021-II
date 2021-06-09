public class TriangulosGregoryNieto{

	public static void main(String[] args){
		int lado1 = 5;
		int lado2 = 4;
		int lado3 = 3;
		String equilatero = "Es un Triángulo Equilatero";
		String isosceles = "Es un Triángulo Isósceles";
		String escaleno = "Es un Triángulo Escaleno";
		
	if (lado1 == lado2 & lado1 == lado3){
		System.out.println(equilatero);	
		}

	else if (lado1 != lado2 & lado1 != lado3 & lado2 != lado3){
		System.out.println(escaleno);	
		}

	else	{
		System.out.println(isosceles);		
		}
	}
}
