class Shape{
public void draw(){
System.out.println("shape can be drawn by many ways based on their structure");
}
}

class Circle extends Shape{
@Override
public void draw(){
System.out.println("Circle contains no edge ,we can make it with a round curve meeting itself");
}
}

class Rectangle extends Shape{
@Override
public void draw(){
System.out.println("Rectange contains four edges,it has 2length and 2width");
}
}

class Square extends Shape{
@Override
public void draw(){
System.out.println("Square has four sides all equal");
}
}

public class ShapeTest{
public static void main(String[] args){

Shape s;

s=new Circle();
s.draw();

s=new Rectangle();
s.draw();

s=new Square();
s.draw();
}
}