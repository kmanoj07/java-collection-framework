import com.kumarmanoj.OurGenericList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // we can't iterate over this list
        // Solution - Iterable interface - it make the class iterable - for loop
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(int x: list){
            System.out.println(x);
        }
    }
}