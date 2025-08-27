import java.util.Scanner;
public class MethodPractice5{

public static boolean isAlphabet(char ch){

if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
return true;
}
else{
return false;
}

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the character : ");
char ch=sc.next().charAt(0);

Boolean result=isAlphabet(ch);
if(result){
System.out.println("entered character is an alphabet");
}
else{
System.out.println("entered character is not an alphabet");
}
sc.close();
}
}