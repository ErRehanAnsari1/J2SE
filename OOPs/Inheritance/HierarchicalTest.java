class Cosmetic{
void facewash(){
System.out.println("Facewash is unisex product");
}
}
class Skincare extends Cosmetic{
void fairness(){
System.out.println("Fairness products are available for men and women both");
}
}
class Antiseptic extends Cosmetic{
void Protection(){
System.out.println("Antiseptic cream protects the skin");
}
}
public class HierarchicalTest{
public static void main(String [] args){
Skincare sc=new Skincare();
sc.facewash();
sc.fairness();

Antiseptic a1=new Antiseptic();
a1.facewash();
a1.fairness();
}
}