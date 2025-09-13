public class TriangleTest{
public static void main(String[] args){

Triangle t=new Triangle();

t.setBorderWidth(10);
t.setColor("Purple");
t.setBase(8);
t.setHeight(12);

int bw=t.getBorderWidth();
String col=t.getColor();
int bs=t.getBase();
int ht=t.getHeight();

System.out.println("Border Width : "+bw);
System.out.println("Color : "+col);
System.out.println("Base : "+bs);
System.out.println("Height : "+ht);

System.out.println("Area : "+t.area());
}
}