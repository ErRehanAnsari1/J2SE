public class FoodItem{
String name;
int price;
String type;

FoodItem(){
name="Unknown";
price=0;
type="veg";
}

FoodItem(String name,int price){
this(name,price,"veg");
}

FoodItem(String name,int price,String type){
this.name=name;
this.price=price;
this.type=type;
}

void display(){
System.out.println("Name : "+name);
System.out.println("Price : "+price);
System.out.println("Type : "+type);
System.out.println(".......................................");
}
public static void main(String[] args){

FoodItem f1=new FoodItem();
f1.display();

FoodItem f2=new FoodItem("Paneer Tikka",200);
f2.display();

FoodItem f3=new FoodItem("Chicken Biryani",500,"Non Veg");
f3.display();

}
}