interface Payment{
void makePayment();
}

class UPI implements Payment{
public void makePayment(){
System.out.println("Payment via UPI");
}
}
class Card implements Payment{
public void makePayment(){
System.out.println("Payment via Card");
}
}
public class PaymentProcessorLooseCoupling{
public static void main(String[] args){
Payment p=new UPI();
p.makePayment();
}
}

