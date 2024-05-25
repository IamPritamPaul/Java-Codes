import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String args[]){
//        PriorityQueue<Integer> pq=new PriorityQueue<>();  // by default min-heap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());  // max-heap
        pq.offer(40);
        pq.offer(64);
        pq.offer(12);
        pq.offer(9);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
