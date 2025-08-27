import java.util.Scanner;
public class MethodPractice6{
public static Boolean isVowel(char ch){

if(ch=='a' ||ch=='A' ||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
return true;
}
else{
return false;
}

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter a character : ");
char ch=sc.next().charAt(0);

Boolean result=isVowel(ch);

if(result){
System.out.println("entered character is vowel");
}
else{
System.out.println("entered character is consonant");
}
}
}