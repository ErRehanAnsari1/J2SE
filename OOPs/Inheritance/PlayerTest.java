class Player{
	String name;
	int age;

Player(String name,int age){
	this.name=name;
	this.age=age;
}
void show(){
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
}
}

class Cricketer extends Player{
	String team;
Cricketer(String name,int age,String team){
	super(name,age);
	this.team=team;

}
void showDetails(){
	super.show();
	System.out.println("Team : "+team);
}
}
public class PlayerTest{
	public static void main(String[] args){
		Cricketer c1= new Cricketer("Virat Kohli",36,"Royal Challengers Bangalore");
		c1.showDetails();
}

}