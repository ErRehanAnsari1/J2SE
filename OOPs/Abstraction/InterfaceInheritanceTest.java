interface A{
void methodA();
}
interface B extends A{
void methodB();
}
class MyClass implements B{
public void methodA(){
System.out.println("i am method A");
}
public void methodB(){
System.out.println("i am method B");
}
}
public class InterfaceInheritanceTest{
public static void main(String[] args){

MyClass m=new MyClass();
m.methodA();
m.methodB();
}
}