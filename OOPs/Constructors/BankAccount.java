import java.util.Scanner;
public class BankAccount{
long accountnumber;
String holdername;
int balance;

BankAccount(){
accountnumber=2233445566l;
holdername="Unknown";
balance=1000;
}

BankAccount(long accountnumber,String holdername){
this(accountnumber,holdername,5000);
}

BankAccount(long accountnumber,String holdername,int balance){
this.accountnumber=accountnumber;
this.holdername=holdername;
this.balance=balance;
}

void display(){
System.out.println("Account Number : "+accountnumber);
System.out.println("Holder Name : "+holdername);
System.out.println("Balance : "+balance);
System.out.println("..............................................");
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

BankAccount b1=new BankAccount();
b1.display();

System.out.println("enter the account number : ");
long accountnumber=sc.nextLong();

System.out.println("enter the name : ");
String name=sc.next();

BankAccount b2=new BankAccount(accountnumber,name);
b2.display();

BankAccount b3=new BankAccount(2233445566l,"Rehan ansari",800);
b3.display();

}
}