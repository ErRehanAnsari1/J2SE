public class AccountTest{
public static void main(String[] args){

//create two accounts

Account a1=new Account(101,"Savings");
Account a2=new Account(102,"Current");

//deposit money
a1.deposit(5000);
a2.deposit(3000);


//show balances
System.out.println("A1 Balance : Rs/-"+a1.getBalance());
System.out.println("A2 Balance : Rs/-"+a2.getBalance());

//withdraw
a1.withdrawal(1000);

//transfer funds from a1 to a2
a1.fundTransfer(a2,1500);

//pay bill from a2
a2.payBill("Electricity",500);

//final balances
System.out.println("A1 final balance : "+a1.getBalance());
System.out.println("A2 final balance : "+a2.getBalance());
}
}