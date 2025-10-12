import java.time.LocalDate;
import java.time.Period;

public class AgeExample{
public static void main(String[] args){
LocalDate dob=LocalDate.of(2003,6,16);
LocalDate today=LocalDate.now();

Period age=Period.between(dob,today);
System.out.println("Age : "+age.getYears()+" years");
}
}