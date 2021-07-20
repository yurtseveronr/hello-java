package _09.lambda;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StreamAPI {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list.toString());

        // forEach method -> Consumer
        list.stream()
                .forEach(number-> System.out.println(number));

        // filter -> Predicate
        list.stream()
                .filter(number-> number<60)
                .forEach(number->System.out.println(number));

        // distinct
        list.stream()
                .distinct()
                .forEach(number-> System.out.println(number));

        // sorted
        list.stream()
                .sorted()
                .forEach(number-> System.out.println(number));

        // sorted : ReverseOrder
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(number-> System.out.println(number));

        // limit
        list.stream()
                .limit(2L)
                .forEach(number-> System.out.println(number));

        // skip
        list.stream()
                .skip(2L)
                .forEach(number-> System.out.println(number));

        // count
        long count = list.stream().count();
        System.out.println(count);

        // any match
        boolean anymatch = list.stream().anyMatch(number-> number<50);
        System.out.println(anymatch);

        // all match
        boolean allmatch = list.stream().allMatch(number->number<50);
        System.out.println(allmatch);

        boolean nonematch = list.stream().noneMatch(number->number<50);
        System.out.println(nonematch);

        // map
        list.stream()
                .map(number->number*2)
                .forEach(number-> System.out.println(number));

        list.stream()
                .map(number-> Math.sqrt(number))
                .forEach(number-> System.out.println(number));




    }
}
