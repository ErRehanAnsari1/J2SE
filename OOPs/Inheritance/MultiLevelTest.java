class Study{
void read(){
System.out.println("Reading");
}
}
class Write extends Study{
void write(){
System.out.println("Writing");
}
}
class Learn extends Write{
void learn(){
System.out.println("Learning");
}
}
public class MultiLevelTest{
public static void main(String[] args){
Learn l1=new Learn();
l1.read();
l1.write();
l1.learn();
}
}