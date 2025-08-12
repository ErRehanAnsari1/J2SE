class Player{
void play(){
System.out.println("Player is playing");
}
}

class Batsman extends Player{
void  bat(){
System.out.println("Batsman is batting");
}
}

public class CricketTest{
public static void main(String[] args){
Player p=new Batsman();//upcasting
p.play();   //valid

Batsman b=(Batsman)p;
b.bat();
}
}