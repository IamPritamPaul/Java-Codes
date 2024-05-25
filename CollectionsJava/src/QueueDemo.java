import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]){
        Queue<Integer> q1=new LinkedList<>();
        q1.offer(12);
        q1.offer(13);
        q1.offer(14);
        q1.offer(15);
        q1.offer(16);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
    }
}
