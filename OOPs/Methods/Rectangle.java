public class Rectangle{

private int borderWidth=0;
private String color="null";
private int width=0;
private int length=0;

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
return (length+width)*2;
}


}