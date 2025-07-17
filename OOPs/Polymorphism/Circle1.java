public class Circle1 extends Shape1{
private double radius;

public Circle1(){
this.radius=5;
}

public Circle1(int borderWidth,String color,double radius){
super(borderWidth,color);
this.radius=radius;
}

public void setRadius(double radius){
this.radius=radius;
}
public double getRadius(){
return radius;
}

@Override
public double area(){
return Math.PI*radius*radius;
}
public double circumference(){
return 2*Math.PI*radius;
}

}