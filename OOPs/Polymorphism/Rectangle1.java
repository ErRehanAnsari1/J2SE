public class Rectangle1 extends Shape1{
private int width;
private int length;

public Rectangle1(){
super();
this.width=8;
this.length=5;
}

public Rectangle1(int borderWidth,String color){
this(borderWidth,color,10,7);
}

public Rectangle1(int borderWidth,String color,int width,int length){
super(borderWidth,color);
this.width=width;
this.length=length;
}

public void setWidth(int width){
this.width=width;
}
public int getWidth(){
return width;
}

public void setLength(int length){
this.length=length;
}
public int getLength(){
return length;
}

public double area(){
return length*width;
}
public double perimeter(){
return 2*(length+width);
}
}