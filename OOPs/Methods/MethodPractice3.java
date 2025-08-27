import java.util.Scanner;
public class MethodPractice3{
public static Boolean evenOrOdd(int num){

if(num%2==0){
System.out.println("entered value is even");
return true;
}
else if(num%2!=0){
System.out.println("entered value is odd");
return true;
}
else{
System.out.println("entered value is zero");
return true;
}

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("enter a number : ");
int num=sc.nextInt();
boolean check=evenOrOdd(num);
}
}