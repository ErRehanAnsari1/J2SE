import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample{
public static void main(String[]args){

Queue<String> queue=new ArrayDeque<>();

//Adding elements to queue

queue.offer("Ticket1");
queue.offer("Ticket2");
queue.offer("Ticket3");

System.out.println("Initial queue : "+queue);

//peeking at the head of the queue
System.out.println("Next in line : "+queue.peek());

while(!queue.isEmpty()){
System.out.println("Serving : "+queue.poll());
}
System.out.println("Final Queue : "+queue);
}
}