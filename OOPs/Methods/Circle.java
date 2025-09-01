public class Circle{
private int borderWidth=0;
private String color="null";
private   double radius=80.08;

public void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}
public void setColor(String color){
this.color=color;
}
public void setRadius(double radius){
this.radius=radius;
}
public int getBorderWidth(){
return borderWidth;
}
public String getColor(){
return color;
}
public double getRadius(){
return radius;
}
public double area(){
return Math.PI*radius*radius;
}
public double circumference(){
return Math.PI*2*radius;
}

public static void main(String[] args){
Circle cir=new Circle();
cir.setBorderWidth(20);
cir.setColor("green");
cir.setRadius(3.45);

System.out.println(cir.area());
System.out.println(cir.circumference());
System.out.println(cir.getColor());
System.out.println(cir.getBorderWidth());
System.out.println(cir.getRadius());
}

}