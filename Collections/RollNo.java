import java.util.LinkedHashSet;

public class RollNo{
public static void main(String[] args){

LinkedHashSet<Integer> roll=new LinkedHashSet<>();

roll.add(1122);
roll.add(2233);
roll.add(3344);
roll.add(4455);
roll.add(1122);
roll.add(3344);
roll.add(5566);
roll.add(6677);

System.out.println("All roll numbers : "+roll);

System.out.println("Total unique roll numbers : "+roll.size());

}
}