import java.util.Date;
import java.text.SimpleDateFormat;
public class PersonTest{
public static void main(String[] args){
  try{
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dob = sdf.parse("16-06-2003");

Person p=new Person("Rehan","khajrana(indore)",dob);
System.out.println("Name : "+p.name);
System.out.println("Address : "+p.address);
System.out.println("Date Of Birth : "+sdf.format(p.dateOfBirth));

System.out.println("Values changed by setter getters");

p.setName("Abbas");
p.setAddress("Silver colony");
p.setDate(sdf.parse("1-1-2000"));
String nm=p.getName();
String ad=p.getAddress();
String dt=p.getDate();

System.out.println("Name : "+nm);
System.out.println("Address : "+ad);
System.out.println("Date : "+dt);
}catch(Exception e){
System.out.println("Date parse error");
}
}
}