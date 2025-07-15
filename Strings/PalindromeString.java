import java.util.Scanner;
public class PalindromeString{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.print("enter the string");
String str=sc.next();
String reverse="";
char ch;

for(int i=0;i<str.length();i++){
ch=str.charAt(i);
reverse=ch+reverse;

}

if(reverse.equals(str)){
System.out.print("string is palindrome");
}
else
System.out.print("string is not palindrome");
sc.close();
}
}