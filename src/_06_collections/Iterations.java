package _06_collections;

import java.util.*;

public class Iterations {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);

        // Traversing with Iterator
        Iterator<Integer> iterator = list.iterator();

        // hasNext - next
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // sorting list
        Collections.sort(list);
      //  Collections.sort(list,Collections.reverseOrder());

        // for each - or Iterable
        for(Integer item : list) {
            System.out.println(item);
        }

        // Traversing with enumeration
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }





    }

}
