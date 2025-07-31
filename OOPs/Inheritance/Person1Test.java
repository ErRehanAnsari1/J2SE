import java.time.LocalDate;
public class Person1Test{
public static void main(String [] args){

Person1 p=new Person1();

LocalDate dob=LocalDate.of(2003,6,16);
p.setName("Rehan Ansari");
p.setDateOfBirth(dob);
p.setAddress("Indore Madhya Pradesh");

System.out.println("Name : "+p.getName());
System.out.println("Date Of Birth : "+p.getDateOfBirth());
System.out.println("Address : "+p.getAddress());

Account a=new Account();
a.setAccountNumber(11223344);
a.setAccountType("Saving Account");
a.deposit(1000);
a.fundTransfer(200);
a.withdrawal(300);
a.payBill(100);

System.out.println("Account Number : "+a.getAccountNumber());
System.out.println("Account Type : "+a.getAccountType());
System.out.println("Current Balance : "+a.getBalance());


}
}