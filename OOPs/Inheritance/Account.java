public class Account extends Person1{
private int accountNumber;
private String accountType;
private double balance;

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

public void deposit(double deposit){
this.balance=balance+deposit;
}

public void withdrawal(double withdrawal){
this.balance=balance-withdrawal;
}

public double getBalance(){
return balance;
}

public void fundTransfer(double fundTransfer){
this.balance=balance-fundTransfer;
System.out.println("Fund Transferred Successfully");
}

public void payBill(double payBill){
this.balance=balance-payBill;
System.out.println(" Bill Payed Successfully");
}
}