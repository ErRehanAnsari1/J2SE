public class Car{
String brand;
String model;
int price;

Car(String brand,String model,int price){
this.brand=brand;
this.model=model;
this.price=price;
}
void displayInfo(){
System.out.println("Brand : "+brand);
System.out.println("model : "+model);
System.out.println("price : "+price);
}
public static void main(String[] args){
Car c1=new Car("Maruti Suzuki","Swift Dzire",500000);
c1.displayInfo();
}
}