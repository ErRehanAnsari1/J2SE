interface Phone{
default void deviceInfo(){
System.out.println("I am a smart phone");
}
}

interface Camera{
default void deviceInfo(){
System.out.println("I am a DSLR camera");
}
}

class SmartGadget implements Phone,Camera{
 @Override
public void deviceInfo(){
Phone.super.deviceInfo();
}
}
public class Gadget{
public static void main(String[] args){

SmartGadget sg=new SmartGadget();
sg.deviceInfo();

}
}