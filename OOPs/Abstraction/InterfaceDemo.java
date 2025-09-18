interface Shayar{
void sherSunao();
}
class MirTaqiMir implements Shayar{
public void sherSunao(){
System.out.println("Patta patta buta buta haal hamara jane he");
}
}

class AllamaIqbal implements Shayar{
public void sherSunao(){
System.out.println("khudi ko kar buland itna");
}
}

public class InterfaceDemo{
public static void main(String [] args){
Shayar s;
s=new MirTaqiMir();
s.sherSunao();

s=new AllamaIqbal();
s.sherSunao();
}
}