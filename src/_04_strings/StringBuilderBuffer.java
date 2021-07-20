package _04_strings;

public class StringBuilderBuffer {

    public static void main(String[] args) {

        /*
        * String is immutable, StringBuilder and StringBuffer is mutable.
        * StringBuffer is thread-safe while StringBuilder is not.
         */

        //StringBuilder and StringBuffer has almost same methods.

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Onur");
        stringBuilder.append(" ");
        stringBuilder.append("Yurtsever");
        System.out.println(stringBuilder);

        StringBuilder stringBuilder_insert = new StringBuilder();
        stringBuilder_insert.append("Java Programming");
        stringBuilder_insert.insert(2,"A");
        System.out.println(stringBuilder_insert);

        StringBuilder stringBuilder_replace = new StringBuilder();
        stringBuilder_replace.append("Java Programming");
        stringBuilder_replace.replace(0,2,"He");
        System.out.println(stringBuilder_replace);

        StringBuilder stringBuilder_delete = new StringBuilder();
        stringBuilder_delete.append("Hello Java");
        stringBuilder_delete.delete(2,4);
        System.out.println(stringBuilder_delete);

        StringBuilder stringBuilder_reverse = new StringBuilder();
        stringBuilder_reverse.append("Hello Java");
        stringBuilder_reverse.reverse();
        System.out.println(stringBuilder_reverse);

        StringBuilder stringBuilder_capacity = new StringBuilder();
        int default_capacity = stringBuilder_capacity.capacity();
        System.out.println(default_capacity);
        stringBuilder_capacity.append("We reached beyond its capacity");
        int new_capacity = stringBuilder_capacity.capacity();
        System.out.println(new_capacity);

        StringBuilder stringBuilder_ensureCapacity = new StringBuilder();
        stringBuilder.ensureCapacity(20);
        int ensure_capacity = stringBuilder_ensureCapacity.capacity();
        System.out.println(ensure_capacity);
        stringBuilder_ensureCapacity.append("There is ocean between us that's not very far");
        System.out.println(stringBuilder_ensureCapacity.capacity());





    }


}
