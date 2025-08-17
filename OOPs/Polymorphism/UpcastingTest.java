class Poet{
void shayari(){
System.out.println("Shayari dil ka sukun hai");
}
}
class RahatIndori extends Poet{
@Override
void shayari(){
System.out.println("Bulati he magar jane ka nahi");
}
void jazbaat(){
System.out.println("Rahat ke jazbaat dil ko Rahat pahuchate hain");
}
}
public class UpcastingTest{
public static void main(String[] args){

Poet p=new RahatIndori();  //upcasting horahi he 
p.shayari();   // right becoz overriden method hi call ho sakti
//p.jazbaat();  // cannot call becz it is not overriden
}
}