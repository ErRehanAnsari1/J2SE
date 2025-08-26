import java.util.Scanner;
public class Demonstration{

public static void add(int a,int b){

int sum=a+b;
System.out.println(sum);

}

public static void sub(int a,int b){

int s=a-b;
System.out.println(s);

}

public static void main (String[] args){


Scanner sc=new Scanner(System.in);
System.out.println("enter num1");
int num1=sc.nextInt();
System.out.println("enter num2");
int num2=sc.nextInt();
System.out.println("Starting of main method");

add(num1,num2);
sub(num1,num2);

}
}