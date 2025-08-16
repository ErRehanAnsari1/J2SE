public class Test1{
public void show(int a){
System.out.println("int version");
}
public void show(double a){
System.out.println("double version");
}
public static void main(String[] args){
Test1 t=new Test1();
t.show(5);
t.show(5.5f);
}
}