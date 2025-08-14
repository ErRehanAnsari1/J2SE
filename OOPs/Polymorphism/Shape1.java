public class Shape1{
private int borderWidth;
private String color;

public Shape1(){
this.borderWidth=7;
this.color="Red";
}

public Shape1(int borderWidth,String color){
this.borderWidth=borderWidth;
this.color=color;
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

public double area(){
return 0.0;
}
public double perimeter(){
return 0.0;
}
}