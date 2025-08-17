public class Vehicle{
void startEngine(){
System.out.println("Vehicle engine is starting.....");
}

}


class Car extends Vehicle{
@Override
void startEngine(){
System.out.println("Car engine started with key.....");
}
}

class Bike extends Vehicle{
@Override
void startEngine(){
System.out.println("Bike engine started with kick.....");
}
}

public class VehicleTest{
public static void main(String[] args){
Vehicle v;
v=new Car();
v.startEngine();

v=new Bike();
v.startEngine();
}
}