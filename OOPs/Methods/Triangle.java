public class Triangle{
private int borderWidth=0;
private String color="null";
private int base=0;
private int height=0;

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


public void setBase(int base){
this.base=base;
}
public int getBase(){
return base;
}


public void setHeight(int height){
this.height=height;
}
public int getHeight(){
return height;
}

public int area(){
return (base*height)/2;
}

}