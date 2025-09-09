public class TestShape{
public static void main(String[] args){

Shape s;    //s is reference variable here
s=new Shape(); //s is an object here

//Shape s=new Shape();//object instantiation

s.setBorderWidth(10);
s.setColor("Red");

int i=s.getBorderWidth();
System.out.println(i);

String col=s.getColor();
System.out.println(col);

Shape s1=new Shape();
s1.setColor("Green");
s1.setBorderWidth(20);

System.out.println(s1.getColor()); //Green
System.out.println(s1.getBorderWidth()); //20
}
}

//Furniture,vehicle,computer,college,library,restaurant,animal
movie,fruits,attendance sheet,company,account