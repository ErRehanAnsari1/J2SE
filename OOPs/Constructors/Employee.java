public class Employee{
String name;
int id;
int salary;

Employee(String name,int id,int salary){
this.name=name;
this.id=id;
this.salary=salary;
}

Employee(String name,int id){
this(name,id,0);
}

void display(){
System.out.println("Name : "+name);
System.out.println("Id : "+id);
System.out.println("Salary : "+salary);
System.out.println();
}
public static void main(String [] args){
Employee e1=new Employee("Rehan",1122,40000);
Employee e2=new Employee("Elizabeth",2233,30000);

e1.display();
e2.display();
}
}