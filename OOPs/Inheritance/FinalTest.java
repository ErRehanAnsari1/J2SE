class Animal{
final void sound(){
System.out.println("Some animal sounds scary");
}
}
class Dog extends Animal{
void bark(){
System.out.println("Dog barking");
}
}
public class FinalTest{
public static void main(String[] args){
Dog d1=new Dog();
d1.sound();
d1.bark();
}
}