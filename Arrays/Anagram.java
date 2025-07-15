import java.util.Arrays;
import java.util.Scanner;
public class Anagram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter first string: ");
String s1=sc.nextLine();
System.out.print("enter second string: ");
String s2=sc.nextLine();



if(s1.length()==s2.length()){
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();

Arrays.sort(c1);
Arrays.sort(c2);

boolean result=Arrays.equals(c1,c2);
if(result){
System.out.println(" Strings are anagram");
System.exit(0);
}

else
System.out.println("Strings are not anagram");

}
else
System.out.println("strings are not anagram");
sc.close();
System.exit(0);

}
}