import java.util.Scanner;

public class WithoutParse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter age : ");
String input=sc.nextLine();

//without parseInt
//System.out.println("String input : "+input);

//with parseInt
int age=Integer.parseInt(input);
System.out.println("Age + 5 : "+(age+5));
sc.close();
}
}