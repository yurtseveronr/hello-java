package _06_collections;

import java.util.HashMap;
import java.util.TreeMap;

public class IMap {
    /*
    * Stores the elements as key,value pair
     */

    public static void main(String[] args) {

        // treemap
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        // putting element
        treeMap.put("Onur",26);
        treeMap.put("Deniz",36);
        treeMap.put("Burcu",28);
        treeMap.put("Can",32);

        // get value of given key
        System.out.println(treeMap.get("Onur"));

        // removing
        treeMap.remove("Onur");
        treeMap.clear();


        // hashmap
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Onur",26);
        hashMap.put("Deniz",36);
        hashMap.put("Burcu",28);
        hashMap.put("Can",32);

        System.out.println(hashMap.get("Deniz"));
        hashMap.remove("Onur");
        hashMap.clear();




    }
}
