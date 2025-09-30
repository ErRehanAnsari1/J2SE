class Transaction{
int amount;
String type;
Transaction(int amount,String type){
this.amount=amount;
this.type=type;
}
}

interface SecureLoggable{}

class OnlineTransaction extends Transaction implements SecureLoggable{
OnlineTransaction(int amount,String type){
super(amount,type);
}
}

class ATMTransaction extends Transaction{
ATMTransaction(int amount,String type){
super(amount,type);
}
}

public class MarkerInterface2{

public static void logTransaction(Transaction t){

if( t instanceof SecureLoggable){
System.out.println("Logging with encryption");
}
else{
System.out.println("Standard log");
}

}

public static void main(String[] args){

Transaction t=new Transaction(200,"cash");
OnlineTransaction ot=new OnlineTransaction(100,"via upi");
ATMTransaction atm= new ATMTransaction(1000,"via card");

logTransaction(t);
logTransaction(ot);
logTransaction(atm);
}
}