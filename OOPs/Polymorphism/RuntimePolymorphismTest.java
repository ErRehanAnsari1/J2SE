class Animal{
void sound(){
System.out.println("Animal makes sound");
}
}

class Dog extends Animal{
@Override
void sound(){
System.out.println("Dog barks");
}
}

class Cat extends Animal{
@Override
void sound(){
System.out.println("Cat meows");
}
}
//Tester class
public class RuntimePolymorphismTest{
public static void main(String[] args){

Animal a=new Dog();  //Parent keeping child's(dogclass)ref
a.sound();  //dog method chalega

Animal a1= new Cat();
a1.sound();    //cat method chalega
}
}