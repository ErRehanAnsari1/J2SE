import java.util.Scanner;
public class MethodPractice4{

public static Boolean leapYear(int year){

if(year%4==0){
System.out.println("entered year is a leap year");
return true;
}

else{
System.out.println("entered year is not a leap year");
return true;
}

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the year : ");
int year=sc.nextInt();

Boolean check=leapYear(year);

sc.close();
}
}