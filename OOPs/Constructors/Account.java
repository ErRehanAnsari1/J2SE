public class Account{
private int accountNumber;
private String accountType;
private double balance;

public Account(){
this.balance=0.0;
}

Account(int accountNumber,String accountType){
this.accountNumber=accountNumber;
this.accountType=accountType;
this.balance=0.0;
}

public void setAccountNumber(int accountNumber){
this.accountNumber=accountNumber;
}
public int getAccountNumber(){
return accountNumber;
}

public void setAccountType(String accountType){
this.accountType=accountType;
}
public String getAccountType(){
return accountType;
}
public void setBalance(double balance){
this.balance=balance;
}
public double getBalance(){
return balance;
}

public void deposit(double amount){
if(amount>0){
balance=balance+amount;
System.out.println("Amount deposited : Rs/- "+amount);
}else{
System.out.println("Invalid deposited amount");
}
}

public void withdrawal(double amount){
if(amount>0 && amount<=balance){
balance=balance-amount;
System.out.println("Amount withdrawn : Rs/- "+amount);
}else{
System.out.println("Insufficient balance or invalid amount");
}
}

public void fundTransfer(Account receiver,double amount){
if(amount>0 && amount<=balance){
this.balance=this.balance-amount;
receiver.balance=receiver.balance+amount;
System.out.println("Rs/-"+amount+"transferred successfully");
}else{
System.out.println("Fund transfer failed");
}
}

public void payBill(String billType,double amount){
if(amount>0 && amount<=balance){
balance=balance-amount;
System.out.println("Paid Rs/-"+amount+" for "+billType+" bill.");
}else{
System.out.println("Bill payment failed.Check balance or amount.");
}
}

}