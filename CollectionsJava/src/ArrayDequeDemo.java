import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String args[]){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(12);
        adq.offer(14);
        adq.offer(13);
        // normally it will act like queue only if nothing has been mentioned
        System.out.println(adq);
        adq.offerFirst(132);
        adq.offerLast(333);
        System.out.println(adq);

        System.out.println("adq.peek(): "+adq.peek());
        System.out.println("adq.peekFirst(): "+adq.peekFirst());
        System.out.println("adq.peekLast(): "+adq.peekLast());

        System.out.println("adq.poll(): "+adq.poll());   //by default first
        System.out.println("adq.pollFirst(): "+adq.pollFirst());
        System.out.println("adq.pollLast(): "+adq.pollLast());
    }
}
