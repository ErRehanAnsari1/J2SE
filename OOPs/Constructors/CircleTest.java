public class CircleTest{
public static void main(String[] args){

Circle c=new Circle(10,"red");
System.out.println("Two parameterized constructor called");
System.out.println(c.borderWidth);
System.out.println(c.color);

Circle c1=new Circle(20,"yellow",8.5);
System.out.println("Three parameterized constructor called");
System.out.println(c1.borderWidth);
System.out.println(c1.color);
System.out.println(c1.radius);

setBorderWidth(12);
int bw=c1.getBorderWidth();

setRadius(5.5);
double rad=c1.getRadius();

setColor("Lemon Green");
String col=c1.getColor();

System.out.println("Values changed by setter getter : ");
System.out.println("Border Width : "+bw);
System.out.println("Radius : "+rad);
System.out.println("Color : "+col);
System.out.println("Area : "+area());
System.out.println("Circumference : "+circumference());


}
}