import java.util.Scanner;
public class MethodPractice1{


public static int Max(int a,int b){


if(a>b){
System.out.println(a);
}
else if(a==b){
System.out.println("both are equal");
}

else
System.out.println(b);

}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter  a");
int a=sc.nextInt();
System.out.println("enter b");
int b=sc.nextInt();



}
}