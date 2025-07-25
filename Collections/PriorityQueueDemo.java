import java.util.PriorityQueue;

public class PriorityQueueDemo{
public static void main(String[] args){

PriorityQueue<Integer>pq=new PriorityQueue<>();

pq.offer(40);
pq.offer(10);
pq.offer(30);
pq.offer(20);

System.out.println("Priority Queue : "+pq);
System.out.println("Peek(highest priority): "+pq.peek());

while(!pq.isEmpty()){
System.out.println("Polled : "+pq.poll());
}

System.out.println("Final queue : "+pq);
}
}