import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){
        Stack<Integer> num=new Stack<>();
        num.push(19);
        num.push(17);
        num.push(16);
        num.push(15);
        num.push(14);
        System.out.println(num);
        System.out.println("After pop: "+num.pop());
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println("After pop: "+num.pop());
        System.out.println(num.peek());
        System.out.println(num);
    }
}
