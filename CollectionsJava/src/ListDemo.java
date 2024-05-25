import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String args[]){
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        list.add(2,45);
        System.out.println("after adding value:45 at index:2 list is:  "+list);

        List<Integer> newlist=new ArrayList<>();
        newlist.add(124);
        newlist.add(162);
        System.out.println(newlist);
        System.out.println(list);
        list.addAll(newlist);
        System.out.println(list);

    }
}
