public class SetterGetter1Test{
public static void main(String[] args){

SetterGetter1 sg=new SetterGetter1();
sg.setBorderWidth(10);
sg.setColor("Blue");

System.out.println("Border Width : "+sg.getBorderWidth());
System.out.println("Color : "+sg.getColor());

}
}