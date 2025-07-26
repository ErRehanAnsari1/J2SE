import java.util.Deque;
import java.util.ArrayDeque;

public class StackDemo3{
public static void main(String[] args){

Deque<Character> stack=new ArrayDeque<>();

stack.push('A');
stack.push('B');
stack.push('C');

System.out.println("Initial stack : "+stack);

while(!stack.isEmpty()){
System.out.println("Popped: "+stack.pop());
}
System.out.println("Stack Empty : "+stack.isEmpty());
}
}