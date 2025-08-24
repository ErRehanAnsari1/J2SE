import java.util.Scanner;
public class MethodPractice2{

public static String positiveOrNegative(int num){

if(num>0){
return"entered value is positive";

}

else if(num==0){
return "entered value is zero";

}
else{
return "entered value is negative";
}

}


public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number :");
int num=sc.nextInt();

String result=positiveOrNegative(num);
System.out.println(result);

}

}