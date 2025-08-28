import java.util.Scanner;
public class MethodPractice10{


public static int[] cbrt(int n,int m){

int size=m-n+1;
int [] cuberoots=new int[size];
int index=0;
for(int i=n;i<=m;i++){

cuberoots[index]=i*i*i;
index++;

}
return cuberoots;
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number from which you want to print cube roots : ");
int n=sc.nextInt();
System.out.println("enter the number till then you want to print cube roots : ");
int m=sc.nextInt();

int [] cbrtarr=cbrt(n,m);

System.out.println("the cuberoots of each value from 2 to 20 are : ");

for(int num:cbrtarr){
System.out.print(num+" ");
}
}
}