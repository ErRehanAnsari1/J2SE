import java.util.Date;
import java.text.SimpleDateFormat;

public class EmployeeTest{
public static void main(String[] args){

try{
Employee e=new Employee();

e.setEmployeeName("Rehan Ansari");
e.setEmployeeID(112233);
e.setSalary(80000);
e.setEmployeeAddress("Green Street,USA");

SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
Date dob=sdf.parse("01-01-2025");
e.setJoiningDate(dob);

String en=e.getEmployeeName();
int ei=e.getEmployeeID();
String ea=e.getEmployeeAddress();
int slr=e.getSalary();

System.out.println("Employee Name : "+en);
System.out.println("Emloyee ID : "+ei);
System.out.println("Employee Salary : "+slr);
System.out.println("Joining Date : "+dob);
System.out.println("Employee Address : "+ea);

}catch(Exception ex){
 		System.out.println("Error : "+ex);
}
}
}