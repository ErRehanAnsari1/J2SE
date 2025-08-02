public class Rectangle extends Shape{
private int width;
private int length;

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

public int area(){
return length*width;
}

public int perimeter(){
return 2*(length+width);
}
}