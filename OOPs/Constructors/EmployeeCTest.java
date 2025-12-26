import java.time.LocalDate;

public class EmployeeCTest{
public static void main(String[] args){

LocalDate joinDate=LocalDate.of(2020,5,10);
EmployeeC emp1=new EmployeeC("Rehan",101,joinDate,50000,"Indore");

System.out.println("Example 1 : ");
System.out.println("Name : "+emp1.getEmployeeName());
System.out.println("ID : "+emp1.getEmployeeID());
System.out.println("Joining Date : "+emp1.getJoiningDate());
System.out.println("Salary : "+emp1.getSalary());
System.out.println("Address : "+emp1.getAddress());

System.out.println();
System.out.println("Example 2 : using setters");

EmployeeC emp2=new EmployeeC();

emp2.setEmployeeName("Abbas");
emp2.setEmployeeID(102);
emp2.setJoiningDate(LocalDate.of(2023,1,15));
emp2.setSalary(60000);
emp2.setAddress("Bhopal");

System.out.println("Name : "+emp2.getEmployeeName());
System.out.println("ID : "+emp2.getEmployeeID());
System.out.println("Joining Date : "+emp2.getJoiningDate());
System.out.println("Salary : "+emp2.getSalary());
System.out.println("Address : "+emp2.getAddress());

}
}