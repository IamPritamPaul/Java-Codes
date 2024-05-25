import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("Pritam");
        studentsName.add("Anik");
        studentsName.add("Anirban");
        studentsName.add("Raju");
//        System.out.println(studentsName);


        studentsName.add(2,"Sudeshna");
//        System.out.println(studentsName);

//        System.out.println(studentsName.get(3));
//        studentsName.remove(1);
//        System.out.println(studentsName.get(3));
//        studentsName.clear();
//        System.out.println(studentsName);
//        for(int i=0;i<studentsName.size();i++){
//            System.out.print(studentsName.get(i)+"  ");
//        }
//        for(String element:studentsName){
//            System.out.println(element);
//        }
        Iterator<String> it=studentsName.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}