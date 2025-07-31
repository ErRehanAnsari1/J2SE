class Vehicle{
void move(){
System.out.println("Vehicle is stopped");
}
}
class Bike extends Vehicle{
void move(){
System.out.println("Vehicle is moving");
}
}
public class MethodOverridingTest{
public static void main(String [] args){
Bike b1=new Bike();
b1.move();
}
}