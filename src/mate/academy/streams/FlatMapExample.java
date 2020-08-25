package mate.academy.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> ints = new ArrayList<>();
        ints.add(List.of(1,2));
        ints.add(List.of(3,4));
        ints.add(List.of(5,6));

        List<Integer> integers = ints.stream()
                .flatMap(List::stream)
                .filter(i -> i > 3)
                .collect(Collectors.toList());
    }
}
