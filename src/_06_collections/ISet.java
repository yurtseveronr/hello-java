package _06_collections;


import java.util.HashSet;
import java.util.TreeSet;

public class ISet {

    /*
     * Set extends Collections
     * Set can't contain duplicate and null values.
     */

    public static void main(String[] args) {

        // ordered list
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);

        // random set
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);







    }
}
