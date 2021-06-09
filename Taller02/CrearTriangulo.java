
public class CrearTriangulo {

    public static void main(String args[]) {
        float ladoA = 30, ladoB = 40, ladoC = 110;
        if (ladoA == ladoB) {
            if (ladoB == ladoC) {
                System.out.println("El triángulo es equilatero");
            }
            if (ladoB != ladoC) {
                System.out.println("El triangulo es isósceles");
            }
        }
        if (ladoA != ladoB) {
            if (ladoB != ladoC) {
                System.out.println("El triángulo es escaleno");
            }
        }

    }
}
