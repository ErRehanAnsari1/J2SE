import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2{
public static void main(String[] args){
Date now=new Date();//CURRENT DATE

SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

String formattedDate=sdf.format(now); //date to string

System.out.println("Current formatted date : "+formattedDate);

System.out.println(now);
}
}