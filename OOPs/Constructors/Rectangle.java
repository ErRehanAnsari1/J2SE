public class Rectangle extends Shape{
private int width;
private int length;

public Rectangle(){
this.width=7;
this.length=12;
}

public Rectangle(int borderWidth,String color){
super(borderWidth,color);
}

public Rectangle(int borderWidth,String color,int width,int length){
super(borderWidth,color);
this.width=width;
this.length=length;
}

public void setLength(int length){
this.length=length;
}
public int getLength(){
return length;
}

public void setWidth(int width){
this.width=width;
}
public int getWidth(){
return width;
}

}