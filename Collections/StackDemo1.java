import java.util.ArrayDeque;

public class StackDemo1{
public static void main(String[] args){

ArrayDeque<String> stack=new ArrayDeque<>();

stack.push("Rehan");
stack.push("Ayaan");
stack.push("Kabir");

System.out.println("Names in stack: "+stack);

stack.pop();    //removes top element

System.out.println("After pop : "+stack);

System.out.println("Top(peek): "+stack.peek());

}
}