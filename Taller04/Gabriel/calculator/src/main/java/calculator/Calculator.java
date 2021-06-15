
package calculator;

public class Calculator {
    // atributos
    public int operando1;
    public int operando2;
    
    public Calculator(int operando1, int operando2){
       this.operando1 = operando1;
       this.operando2 = operando2;
    }
    //metodos
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
  
    public int multiplicar(){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    
    public double dividir(){
        double division = (double)this.operando1 / (double)this.operando2;
        return division;
    }
    
}
