public class Person3Test{
public static void main(String[] args){

Student3 s=new Student3();

s.setName("Gautam");
s.setAddress("Airport road,Indore");
s.setRollNumber(1234);
s.setStandard(10);
s.setFees(30000);

System.out.println("Name : "+s.getName());
System.out.println("Address : "+s.getAddress());
System.out.println("Roll Number : "+s.getRollNumber());
System.out.println("Class : "+s.getStandard());
System.out.println("Fees : "+s.getFees());


Staff3 sf=new Staff3();

sf.setName("Ayan khan");
sf.setAddress("Manikbagh,Indore");
sf.setStaffID(45632890);
sf.setSalary(25000);

System.out.println("Name : "+sf.getName());
System.out.println("Address : "+sf.getAddress());
System.out.println("Staff ID : "+sf.getStaffID());
System.out.println("Salary : "+sf.getSalary());

}
}