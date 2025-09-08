public class TestCircle{
public static void main(String[] args){

Circle c=new Circle();

c.setBorderWidth(5);
c.setRadius(4.4);
c.setColor("Violet");

int bw=c.getBorderWidth();
double rd=c.getRadius();
String col=c.getColor();

System.out.println(bw);
System.out.println(rd);
System.out.println(col);

System.out.println("Area : "+c.area());
System.out.println("Circumference : "+c.circumference());
}
}