public class Rectangle{

int borderWidth;
String color;
int width;
int length;

Rectangle(){     //default constructor

}

Rectangle(int borderWidth,String color){

this.borderWidth=borderWidth;
this.color=color;

}

Rectangle(int borderWidth,String color,int width,int length){
this.borderWidth=borderWidth;
this.color=color;
this.width=width;
this.length=length;
}

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
return 2(length+width);
}

}