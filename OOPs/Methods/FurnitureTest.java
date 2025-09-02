public class FurnitureTest{
public static void main(String[] args){

Furniture f=new Furniture();

f.setChair("Foldable chair");
f.setMaterial("Wood with some metal");
f.setPrice(800);
f.setWeight(2.11);

String chr=f.getChair();
String mtr=f.getMaterial();
int prc=f.getPrice();
double wght=f.getWeight();

System.out.println("Chair Type : "+chr);
System.out.println("Chair Material : "+mtr);
System.out.println("Chair Price : "+prc);
System.out.println("Chair Weight : "+wght+" kgs ");
}
}