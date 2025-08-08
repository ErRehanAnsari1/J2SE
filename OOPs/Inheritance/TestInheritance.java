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

Car c1=new Car();
c1.brand="Tesla";
c1.modelname="Model 7";

c1.move();     //parent class method
c1.display();  //child class method
}
}