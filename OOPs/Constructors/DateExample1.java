import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1{
public static void main(String[] args){
try{
String datestr="16-06-2003";
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
Date date=sdf.parse(datestr);   //string to date

System.out.println("parsed date : "+date);
}catch(Exception e){
System.out.println("Error parsing date");
}
}
}