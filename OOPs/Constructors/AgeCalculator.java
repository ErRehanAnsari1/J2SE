import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator{
public static void main(String[] args){

LocalDate dob=LocalDate.of(2003,6,16);
LocalDate today=LocalDate.now();

Period age=Period.between(dob,today);

System.out.println("Age is : "+age.getYears()+" years, "+age.getMonths()+" month, and "+age.getDays()+" days");
}
}