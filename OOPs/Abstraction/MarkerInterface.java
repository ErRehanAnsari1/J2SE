class User{
String name;
User(String name){
this.name=name;
}
}

interface EmergencyAccess{}

//doctor and nurse are emergency access users:

class Doctor extends User implements EmergencyAccess{
Doctor(String name){
super(name);
}
}

class Nurse extends User implements EmergencyAccess{
Nurse(String name){
super(name);
}
}

//patient is a normal user

class Patient extends User{
Patient(String name){
super(name);
}
}



public class MarkerInterface{


public static void checkAccess(User u){

if(u instanceof EmergencyAccess){
System.out.println("Access Granted");
}

else{
System.out.println("Access denied");
}

}

public static void main(String[] args){
User doc=new Doctor("Dr samir");
User nurse=new Nurse("Nurse Anjali");
User patient=new Patient("Rahul");

checkAccess(doc);
checkAccess(nurse);
checkAccess(patient);
}
}



