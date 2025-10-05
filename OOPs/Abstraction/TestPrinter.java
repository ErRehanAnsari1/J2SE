interface Printer{

default void printHello(){
commonHeader();
System.out.println("Hello world");
}

default void printBye(){
commonHeader();
System.out.println("GoodBye");
}

private void commonHeader(){
System.out.println("----printing start----");
}
}
class MyPrinter implements Printer{}

public class TestPrinter{
public static void main(String[] args){

Printer p=new MyPrinter();
p.printHello();
p.printBye();

}
}