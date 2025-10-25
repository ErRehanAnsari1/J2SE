import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample{
public static void main(String[] args){
try{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
Date dob=sdf.parse("16-06-2003");
System.out.println("Parsed date : "+dob);
}catch(Exception e){
System.out.println("Date parse error");
}
}
}