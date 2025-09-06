public class Shape{

private String color=null;
private int borderWidth=0;//attributes or member variables


public void setBorderWidth(int borderWidth){   //setter

this.borderWidth=borderWidth;

}

public int getBorderWidth(){            //getter
return borderWidth; 
}

public void setColor(String color){
this.color=color;
}

public String getColor(){     //member methods
return color;
}
}