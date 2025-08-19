public class Staff extends Person{
private int staffID;
private int salary;

public Staff(){

}

public Staff(String name,String address){
super(name,address);
}

public Staff(String name,String address,int staffID,int salary){
super(name,address);
this.staffID=staffID;
this.salary=salary;
}

public void setStaffID(int staffID){
this.staffID=staffID;
}
public int getStaffID(){
return staffID;
}

public void setSalary(int salary){
this.salary=salary;
}
public int getSalary(){
return salary;
}

}