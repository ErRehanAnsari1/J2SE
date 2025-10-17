public class Circle{
int borderWidth;
String color;
double radius;

Circle(){  //no arg

}

Circle(int borderWidth , String color){  // two parameterized

this.borderWidth=borderWidth;
this.color=color;

}

Circle(int borderWidth,String color,double radius){ //threeparamet:
this(borderWidth,color);
this.radius=radius;

}

void setBorderWidth(int borderWidth){
this.borderWidth=borderWidth;
}
int getborderWidth(){
return borderWidth;
}

void setRadius(double radius){
this.radius=radius;
}
double getRadius(){
return radius;
}

void setColor(String color){
this.color=color;
}
String getColor(){
return color;
}

double area(){
return 3.14*radius*radius;
}

double circumference(){
return 2*3.14*radius;
}

}