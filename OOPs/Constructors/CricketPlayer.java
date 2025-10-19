public class CricketPlayer{

String name;
int runs;
String role;

CricketPlayer(String name,int runs,String role){
this.name=name;
this.runs=runs;
this.role=role;
}

void display(){
System.out.println("Name : "+name);
System.out.println("Runs : "+runs);
System.out.println("Role : "+role);
System.out.println("......................................");
}
public static void main(String[] args){

CricketPlayer[] cp=new CricketPlayer[5];

cp[0]=new CricketPlayer("Virat Kohli",25000,"Batsman");
cp[1]=new CricketPlayer("Brett Lee",800,"Bowler");
cp[2]=new CricketPlayer("Muttiah Murlitharan",1250,"Bowler");
cp[3]=new CricketPlayer("Hashim Amla",22000,"Batsman");
cp[4]=new CricketPlayer("Mitchell Starc",700,"Bowler");

System.out.println("Batsmen : ");

for(int i=0;i<cp.length;i++){
if(cp[i].role.equals("Batsman")){
cp[i].display();
}
}

System.out.println("Bowlers : ");

for(int i=0;i<cp.length;i++){
if(cp[i].role.equals("Bowler")){
cp[i].display();
}
}
}

}