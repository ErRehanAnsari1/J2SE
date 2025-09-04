public class RectangleTest{
public static void main(String[]args){

Rectangle rc=new Rectangle();

rc.setBorderWidth(5);
rc.setColor("yellow");
rc.setWidth(8);
rc.setLength(10);

int bw=rc.getBorderWidth();
String col=rc.getColor();
int wd=rc.getWidth();
int lg=rc.getLength();

System.out.println("Border width : "+bw);
System.out.println("Color : "+col);
System.out.println("Width : "+wd);
System.out.println("Length : "+lg);

System.out.println("Area : "+rc.area());
System.out.println("Perimeter : "+rc.perimeter());
}
}