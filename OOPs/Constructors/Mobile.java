public class Mobile{
String brand;
int price;
String color;

Mobile(){              // default constructor
brand="unknown";
price=0;
color="black";
}
Mobile(String brand,int price){         //two arguments only
this.brand=brand;
this.price=price;
this.color="black";
}
Mobile(String brand,int price,String color){
this.brand=brand;
this.price=price;
this.color=color;
}

void display(){
System.out.println("brand : "+brand);
System.out.println("price : "+price);
System.out.println("color : "+color);
System.out.println();
}

public static void main(String[] args){
 
Mobile m1=new Mobile();
Mobile m2=new Mobile("Vivo",5000);
Mobile m3=new Mobile("Samsung",10000,"Blue");

m1.display();
m2.display();
m3.display();
}
}