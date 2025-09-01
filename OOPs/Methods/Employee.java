import java.util.Date;

public class Employee{
private String employeeName="null";
private int employeeID=0;
private int salary=0;
private String employeeAddress="0";
private Date joiningDate;

public void setJoiningDate(Date joiningDate){
this.joiningDate=joiningDate;
}
public Date getJoiningDate(){
return joiningDate;
}

public void setEmployeeName(String employeeName){
this.employeeName=employeeName;
}
public String getEmployeeName(){
return employeeName;
}

public void setEmployeeAddress(String employeeAddress){
this.employeeAddress=employeeAddress;
}
public String getEmployeeAddress(){
return employeeAddress;
}

public void setEmployeeID(int employeeID){
this.employeeID=employeeID;
}
public int getEmployeeID(){
return employeeID;
}

public void setSalary(int salary){
this.salary=salary;
}
public int getSalary(){
return salary;
}
}