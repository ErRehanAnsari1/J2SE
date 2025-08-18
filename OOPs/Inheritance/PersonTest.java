public class PersonTest{
public static void main(String [] args){

System.out.println();

Student s=new Student("Hii","Hello");

s.setName("Ikhlas Sheikh");
s.setAddress("Azad nagar");
s.setRollNumber(22332233);
s.setStudentClass(12);
s.setFees(10000);

System.out.println("Student : ");

System.out.println();

System.out.println("Name : "+s.getName());
System.out.println("Address : "+s.getAddress());
System.out.println("Roll Number : "+s.getRollNumber());
System.out.println("Student Class : "+s.getStudentClass());
System.out.println("Fees : "+s.getFees());

System.out.println();

Staff st=new Staff();

st.setName("Mr.Raffey Sir");
st.setAddress("Azad nagar");
st.setStaffID(21234);
st.setSalary(400000);

System.out.println("Staff : ");

System.out.println();

System.out.println("Name : "+st.getName());
System.out.println("Address : "+st.getAddress());
System.out.println("Staff ID : "+st.getStaffID());
System.out.println("Salary : "+st.getSalary());

}
}