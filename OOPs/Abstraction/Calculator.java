interface Calculator{
default void sum(int a,int b){
System.out.println("Sum : "+compute(a,b));
}
static void multiply(int a,int b){
System.out.println("Product : "+compute(a,b));
}
private static int compute(int x,int y){
return x+y;
}
}

class MyCalc implements Calculator{}

public class TestCalc{
public static void main(String[] args){
Calculator calc=new MyCalc();

calc.sum(4,5); //default method
Calculator.multiply(4,5);   //static method   just to understand both //method conflicts in interfaces
}
}
