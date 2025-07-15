public class AdditionTest{
public static void main(String [] args){

Addition a=new Addition();

System.out.println("int 2 parameters"+a.addition(5,10));
System.out.println("int 3 parameters"+a.addition(5,10,15));
System.out.println("float 2 parameters"+a.addition(4.5f,3,2f));
System.out.println("float 3 parameters"+a.addition(1.2f,5.6f));
System.out.println("double 2 parameters"+a.addition(3.3,5.5));
System.out.println("double 3 parameters"+a.addition(2.2,3.3,4.4));


}
}