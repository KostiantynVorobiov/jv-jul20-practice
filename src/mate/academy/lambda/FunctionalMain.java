package mate.academy.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mate.academy.immutable.Car;

public class FunctionalMain {
    public static void main(String[] args) {
        Comparator<Car> carComparator = Comparator.comparingInt(Car::getYear);

        ToIntFunction<String> stringToIntFunction = Integer::parseInt;

        int value = stringToIntFunction.applyAsInt("123");
        System.out.println(value);

        Function<Car, List<String>> carFunction = car -> {
            if (car.getYear() > 2019) {
                return car.getOwners();
            }
            return Collections.emptyList();
        };

        // Function<Integer, String> integerStringFunction = String::valueOf;

        Stream<Integer> stream = Stream.of(1, 2, 3);
        List<String> collect = stream
                .map(integerValue -> "a" + integerValue)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
