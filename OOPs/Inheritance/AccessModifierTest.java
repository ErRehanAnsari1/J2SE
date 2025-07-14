class Bowler{
protected void display(){
System.out.println("He is a bowler");
}
}
class AllRounder extends Bowler{
@Override
public void display(){

System.out.println("He is AllRounder");
super.display();

}
}
public class AccessModifierTest{
public static void main(String[] args){

AllRounder a1=new AllRounder();
a1.display();
}
}