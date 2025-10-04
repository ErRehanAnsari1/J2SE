interface A{

default void message(){
System.out.println("Message from A");
}
}

interface B{

default void message(){
System.out.println("Message from B");
}
}

class Confused implements A,B{

@Override
public void message(){
//we have to override mandatory to resolve conflict
System.out.println("Confused : combining both");
A.super.message();
B.super.message();
}
}
public class TestConflict{
public static void main(String[] args){
new Confused().message();
}
}