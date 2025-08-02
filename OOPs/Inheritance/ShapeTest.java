public class ShapeTest{
public static void main(String[] args){

Rectangle r=new Rectangle();
r.setWidth(5);
r.setLength(10);
r.setBorderWidth(3);
r.setColor("Yellow");

System.out.println("Rectangle : ");
System.out.println("Width : "+r.getWidth());
System.out.println("Length : "+r.getLength());
System.out.println("Area : "+r.area());
System.out.println("Perimeter : "+r.perimeter());
System.out.println("Color : "+r.getColor());
System.out.println("Border Width : "+r.getBorderWidth());
System.out.println();

Triangle t=new Triangle();
t.setBase(10);
t.setHeight(5);
t.setBorderWidth(2);
t.setColor("Green");

System.out.println("Triangle : ");
System.out.println("Base : "+t.getBase());
System.out.println("Height : "+t.getHeight());
System.out.println("Area : "+t.area());
System.out.println("Color : "+t.getColor());
System.out.println("Border Width : "+t.getBorderWidth());
System.out.println();

Circle c=new Circle();
c.setRadius(5.5);
c.setColor("Red");
c.setBorderWidth(4);

System.out.println("Circle : ");
System.out.println("Radius : "+c.getRadius());
System.out.println("Area : "+c.area());
System.out.println("Circumference : "+c.circumference());
System.out.println("Color : "+c.getColor());
System.out.println("Border Width : "+c.getBorderWidth());

}
}