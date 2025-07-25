import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBank{
public static void main(String[] args){

Queue<String>queue=new ArrayDeque<>();

queue.offer("Ali");
queue.offer("Rehan");
queue.offer("Zoya");
queue.offer("Kabir");
queue.offer("Ayesha");

System.out.println("Initial token queue : "+queue);

System.out.println("Next customer in line : "+queue.peek());
while(!queue.isEmpty()){
System.out.println("Serving : "+queue.poll());
}
System.out.println("Final queue : "+queue);
}
}