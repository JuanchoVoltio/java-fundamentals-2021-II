package calculator;

public class Main {
    public static void main (String[] args){
     
        Calculator miCalculator = new Calculator(69,9);//creo el objeto
        
        int suma = miCalculator.sumar();
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + miCalculator.restar());
        System.out.println("La multiplicación es: " + miCalculator.multiplicar());
        System.out.println("La división es: " + miCalculator.dividir());
    }
    
}
