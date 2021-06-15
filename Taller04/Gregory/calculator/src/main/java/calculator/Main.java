
package calculator;

public class Main {
    public static void main(String[] args){
        Calculator operation1 = new Calculator();
        Calculator operation2 = new Calculator();
        Calculator operation3 = new Calculator();
        Calculator operation4 = new Calculator();
        operation1.name = "Add";
        operation2.name = "Subtract";
        operation3.name = "Multiply";
        operation4.name = "divide";
        double x = 10;
        double y = 10;
        operation1.sum(x, y);
        operation2.subtraction(x, y);
        operation3.multiplication(x, y);
        operation4.division(x, y);
    }
}
