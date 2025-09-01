public class Circle2{
private int borderWidth;
private String color;
private double radius;

public void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}
public int getBorderWidth(){
return borderWidth;
}

public void setColor(String color){
this.color=color;
}
public String getColor(){
return color;
}

public void setRadius(double radius){
this.radius=radius;
}
public double getRadius(){
return radius;
}

public double area(){
return Math.PI*radius*radius;
}

public double circumference(){
return 2*Math.PI*radius;
}

public static void main(String[] args){

Circle2 c=new Circle2();

c.setBorderWidth(5);
c.setColor("Yellow");
c.setRadius(8);

System.out.println("Border Width : "+c.getBorderWidth());
System.out.println("Color : "+c.getColor());
System.out.println("Radius : "+c.getRadius());
System.out.println("Area : "+c.area());
System.out.println("Circumference : "+c.circumference());   
}

}