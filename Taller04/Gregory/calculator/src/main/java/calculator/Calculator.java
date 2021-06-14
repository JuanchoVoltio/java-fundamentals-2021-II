
package calculator;


public class Calculator {
    String name;
   
    public void sum(double a, double b){
        double result = a + b;
        System.out.println(name + " result is: " + result);
    }
    
    public void subtraction(double a, double b){
        double result = a - b;
        System.out.println(name + " result is: " + result);
    }
    
    public void multiplication(double a, double b){
        double result = a * b;
        System.out.println("The result of the " +name+ " is: " + result);
    }
    
    public void division(double a, double b){
        double result = a / b;
        System.out.println("The result of the " + name + "  is: " + result);
    }
}
