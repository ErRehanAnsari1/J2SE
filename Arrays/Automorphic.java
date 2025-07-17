import java.util.Scanner;
public class Automorphic{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number :");
int number=sc.nextInt();
int square=number*number;
int temp=number;
int length=0;
while(temp>0){
temp=temp/10;
length++;
}
int end=square%(int)Math.pow(10,length);

if(number==end){
System.out.println("Automorphic number");
}
else{
System.out.println("Not Automorphic number");
}
sc.close();
}
}