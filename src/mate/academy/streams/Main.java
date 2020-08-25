package mate.academy.streams;

import java.util.List;

public class Main {
    private static int sumStream(List<Integer> list) {
        //write your code here
        /* int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 10) {
                sum = sum + list.get(i);
            }
        }
        return sum; */

        /*Predicate<Integer> predicate = new Predicate<>() {
            public boolean test(Integer i) {
                return i > 10;
            }
        }*/

        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
}
