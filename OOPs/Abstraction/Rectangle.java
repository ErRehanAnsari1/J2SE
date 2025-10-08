public class Rectangle extends Shape{
private int width;
private int length;

public Rectangle(){
this.width=5;
this.length=7;
}

public Rectangle(int borderWidth,String color){
super(borderWidth,color);
this.width=6;
this.length=7;
}

public Rectangle(int borderWidth,String color,int width,int length){
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
}