public class CricketTeam{
String playername;
String role;
int matchesplayed;
int totalruns;
int wickettaken;

CricketTeam(String playername,String role,int matchesplayed,int totalruns,int wickettaken){
this.playername=playername;
this.role=role;
this.matchesplayed=matchesplayed;
this.totalruns=totalruns;
this.wickettaken=wickettaken;
}
void display(){
System.out.println("Player Name : "+playername);
System.out.println("Role : "+role);
System.out.println("Matches Played : "+matchesplayed);
System.out.println("Total Runs : "+totalruns);
System.out.println("Wicket Taken : "+wickettaken);
System.out.println("Average : "+ totalruns/matchesplayed);
System.out.println("...........................................................");
}
public static void main(String[] args){

CricketTeam [] ct=new CricketTeam[5];

ct[0]=new CricketTeam("ABD Villiers","Batsman",400,20000,102);
ct[1]=new CricketTeam("Kusal Mendis","Wicket-Keeper",150,5000,0);
ct[2]=new CricketTeam("Jacques Kallis","All-Rounder",340,12000,300);
ct[3]=new CricketTeam("Malcolm Marshall","Bowler",300,1500,450);
ct[4]=new CricketTeam("Moeen Ali","All-Rounder",320,10000,310);

System.out.println("\nAll-Rounder");
for(int i=0;i<ct.length;i++){
if(ct[i].role.equals("All-Rounder")){
ct[i].display();
}
}
System.out.println("\nWicket-Keeper");
for(int i=0;i<ct.length;i++){
if(ct[i].role.equals("Wicket-Keeper")){
ct[i].display();
}
}
System.out.println("\nBatsmen");
for(int i=0;i<ct.length;i++){
if(ct[i].role.equals("Batsman")){
ct[i].display();
}
}
System.out.println("\nBowlers");
for(int i=0;i<ct.length;i++){
if(ct[i].role.equals("Bowler")){
ct[i].display();
}
}

}

}