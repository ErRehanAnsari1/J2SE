import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class PersonTest{
public static void main(String[] args)throws ParseException{

Person p=new Person();
p.setName("Rehan Ansari");


p.setAddress("Melbourne,Victoria(Australia)");



SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
Date dob=sdf.parse("16-06-2003");
p.setDateOfBirth(dob);

String add=p.getAddress();
String nme=p.getName();
Date date=p.getDateOfBirth();

System.out.println("Name : "+nme);
System.out.println("Address : "+add);
System.out.println("Date Of Birth : "+date);
}
}