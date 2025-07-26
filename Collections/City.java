import java.util.Deque;
import java.util.ArrayDeque;

public class City{
public static void main(String[] args){

Deque<String>stack=new ArrayDeque<>();

stack.push("Delhi");
stack.push("Mumbai");
stack.push("Indore");
stack.push("Ahmedabad");
stack.push("Goa");

System.out.println("Top element : "+stack.peek());

System.out.println("\nStack initially : "+stack);
System.out.println();
while(!stack.isEmpty()){
System.out.println("Popped element : "+stack.pop());

}

System.out.println("\n Final Stack : "+stack);
}
}