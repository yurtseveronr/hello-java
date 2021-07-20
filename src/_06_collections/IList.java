package _06_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IList {

    public static void main(String[] args) {
        /*
        * List extends Collections
        * List can contain duplicate and null values.
        * ArrayList
        * LinkedList
        * Vector
        * Stack
         */

        /*
        * Arraylist extends AbstractList, implements List
        * ArrayList class is non synchronized
        * ArrayList allows random access because array works at the index basis
         */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i); // add new element
        }

        // get a element given index or element
        System.out.println(list.get(0));
        System.out.println(list.get(9));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));

        // Difference between set and add
        list.set(0,11); // -> index,element
        list.add(0,11); // index, element
        System.out.println(list);

        // remove element (index, element or the whole ArrayList)
        list.remove(0); // -> index
        //list.removeAll(list);
        //list.clear();

        boolean isEmpty = list.isEmpty();
        list.trimToSize();
        boolean contains = list.contains(7);

        /*
        * LinkedList extends AbstractSequentialList, implements List and Deque
        * LinkedList class can contain duplicate and null elements
        * LinkedList class is non synchronized.
        *  LinkedList class can be used as a List, Stack or Queue.
         */

        LinkedList<String> linkedList = new LinkedList<>();

        //adding new element
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");
        linkedList.set(7,"H");
        linkedList.add(1,"A");
        linkedList.addFirst("First Element");
        linkedList.addLast("Last Element");
        //List<String> new_list = new ArrayList<>();
        //linkedList.addAll(new_list);

        // removing element
        linkedList.remove(0); //linkedList.removeFirst()
        linkedList.remove("C");
        linkedList.removeLast();
        linkedList.removeFirstOccurrence("A");
        linkedList.removeLast();
        linkedList.removeLastOccurrence("A");
        //linkedList.clear();  -> remove the whole list

        boolean linked_list_contains = list.contains("F");
        System.out.println(linked_list_contains);
        int size = linkedList.size();
        System.out.println(size);

        // get element
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.indexOf("D"));
        System.out.println(linkedList.lastIndexOf("A"));

        // returns and remove
        linkedList.poll();
        linkedList.pollFirst();
        linkedList.pollLast();

        // returns but doesn't remove
        String peek = linkedList.peek();
        String peekFirst = linkedList.peekFirst();
        String peekLast = linkedList.peekLast();

        // stack
        Stack<String> stack = new Stack<>();

        // pushing element to stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        // pop elements
        while (!stack.isEmpty()) {
            stack.pop();
        }








    }
}
