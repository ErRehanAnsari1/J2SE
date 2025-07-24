import java.util.LinkedHashSet;

public class Mobile{
public static void main(String[] args){

LinkedHashSet<String> mbl=new LinkedHashSet<>();

mbl.add("Vivo");
mbl.add("Samsung");
mbl.add("Apple");
mbl.add("Vivo");
mbl.add("Apple");
mbl.add("Motorola");
mbl.add("Oppo");
mbl.add("Lava");

System.out.println("Mobile brands without duplicacy in inserted order : "+mbl);

}
}