public class Circle extends Shape{
private double radius;

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
return Math.PI*2*radius;
}
}