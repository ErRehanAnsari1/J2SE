class Animal{
String type;

Animal(String type){
this.type=type;
System.out.println("Animal constructor called");
}

void sound(){
System.out.println("Animals make sound!");
}

}

class Dog extends Animal{
String breed;

Dog(String type,String breed){
super(type);
this.breed=breed;
System.out.println("Dog constructor called");
}
void showDetails(){
super.sound();
System.out.println("Animal Type : "+type);
System.out.println("Dog Breed  : "+breed);
}
}

public class TestDog{
public static void main(String [] args){
Dog d1=new Dog("Mammal","German Shepherd");
d1.showDetails();
}
}