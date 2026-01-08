import java.time.LocalDate;

public class LocalDateExample2{
public static void main(String[] args){
LocalDate today=LocalDate.now();
LocalDate futuredate=today.plusDays(30);

System.out.println("Today : "+today);
System.out.println("Date after 30 days : "+futuredate);
}
}