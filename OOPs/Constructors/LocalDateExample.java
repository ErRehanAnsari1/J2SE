import java.time.LocalDate;

public class LocalDateExample{
public static void main(String[] args){
LocalDate today=LocalDate.now();  //current date
LocalDate dob=LocalDate.of(2003,6,16);//fixed date

System.out.println("Today : "+today);
System.out.println("DOB : "+dob);
}
}