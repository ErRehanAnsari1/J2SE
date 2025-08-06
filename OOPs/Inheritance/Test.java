class Person{

String name;
int age;

Person(String name,int age){
this.name=name;
this.age=age;
}

void display(){
System.out.println("Name : "+name);
System.out.println("Age : "+age);
}

}

class Employee extends Person{

int salary;

Employee(String name,int age,int salary){
super(name,age);//calling parent constructor
this.salary=salary;//setting salary manually
}
void displayEmployee(){
display();   //display() of parent class
System.out.println("Salary : "+salary);
}
}
public class Test{
public static void main(String[] args){
Employee e1=new Employee("Rehan",22,50000);
e1.displayEmployee();
}
}