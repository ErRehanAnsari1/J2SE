class Vehicle{      //parent class
String brand;

void move(){
System.out.println("Vehicle is moving");
}
}

class Car extends Vehicle{//child class
String modelname;
void display(){
System.out.println("Brand : "+brand);
System.out.println("Model Name : "+modelname);
}
}
public class TestInheritance{
public static void main(String[] args){
Vehicle v1=new Vehicle();
v1.move();   //parent class method
v1.display();   //child class method
}
}