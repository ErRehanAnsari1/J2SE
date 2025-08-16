class Base{
static void display(){
System.out.println("Base static");
}
}

class Derived extends Base{
static void display(){
System.out.println("Derived static");
}
}

public class Test3{
public static void main(String[] args){
Base b=new Derived();
b.display();
}
}