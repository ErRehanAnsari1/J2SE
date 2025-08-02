class Person{
void display(){

System.out.println("Student is selfish");

}
}
class Student extends Person{

@Override
void display(){

System.out.println("Person is selfish");
super.display();

}
}
public class PersonOverride{
public static void main(String [] args){
Student s1=new Student();
s1.display();
}
}