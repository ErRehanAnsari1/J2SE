import java.util.*;

public class StackDemo{
public static void main(String[] args){

Deque<Integer> stack=new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println("Stack after pushes : "+stack);
System.out.println("Top element(peek) : "+stack.peek());

System.out.println("Popped element : "+stack.pop());

System.out.println("Stack after pop : "+stack);

}
} 