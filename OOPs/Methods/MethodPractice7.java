import java.util.Scanner;
public class MethodPractice7{
public static Boolean checkLowerCase(char ch){

if((ch>='a' && ch<='z')){
return true;
}
else{
return false;
}

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter  a character");
char ch=sc.next().charAt(0);

Boolean result=checkLowerCase(ch);

if(result){
System.out.println("entered character is a lowercase alphabet");
}
else{
System.out.println("entered character is an Uppercase alphabet");
}
sc.close();
}
}