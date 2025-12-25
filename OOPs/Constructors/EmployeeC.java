import java.time.LocalDate;

public class EmployeeC{
private String employeeName;
private int employeeID;
private LocalDate joiningDate;
private int salary;
private String employeeAddress;

public EmployeeC(){
LocalDate dob=LocalDate.of(2003,1,1);
this.employeeName="Ali";
this.employeeID=1122;
this.joiningDate=dob;
this.salary=30000;
this.employeeAddress="Local Street,Kolkata";
}

public EmployeeC(String employeeName,int employeeID){
this.employeeName=employeeName;
this.employeeID=employeeID;
}

public EmployeeC(String employeeName,int employeeID,LocalDate joiningDate,int salary,String employeeAddress){
this.employeeName=employeeName;
this.employeeID=employeeID;
this.joiningDate=joiningDate;
this.salary=salary;
this.employeeAddress=employeeAddress;
}

public void setEmployeeName(String employeeName){
this.employeeName=employeeName;
}
public String getEmployeeName(){
return employeeName;
}

public void setEmployeeID(int employeeID){
this.employeeID=employeeID;
}
public int getEmployeeID(){
return employeeID;
}

public void setJoiningDate(LocalDate joiningDate){
this.joiningDate=joiningDate;
}
public LocalDate getJoiningDate(){
return joiningDate;
}

public void setSalary(int salary){
this.salary=salary;
}
public int getSalary(){
return salary;
}

public void setAddress(String employeeAddress){
this.employeeAddress=employeeAddress;
}
public String getAddress(){
return employeeAddress;
}

}