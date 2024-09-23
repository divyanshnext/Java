import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1,1);
        list.add(2,8);
        list.add(3,2);
        list.add(4,9);
        
        list.set(2,9);
        System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        for(int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}

