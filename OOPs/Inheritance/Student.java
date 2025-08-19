public class Student extends Person{
private int rollNumber;
private int studentClass;
private double fees;

public Student(){
this.rollNumber=1122334455;
this.studentClass=9;
this.fees=10000;
}

public Student(String name,String address){
super(name,address);
}

public Student(String name,String address,int rollNumber){
super(name,address);
this.rollNumber=rollNumber;
} 

public Student(String name,String address,int rollNumber,int studentClass,double fees){
super(name,address);
this.rollNumber=rollNumber;
this.studentClass=studentClass;
this.fees=fees;

}

public void setRollNumber(int rollNumber){
this.rollNumber=rollNumber;
}
public int getRollNumber(){
return rollNumber;
}

public void setStudentClass(int studentClass){
this.studentClass=studentClass;
}
public int getStudentClass(){
return studentClass;
}

public void setFees(double fees){
this.fees=fees;
}
public double getFees(){
return fees;
}



}