package mate.academy.streams.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> ofNullable = Optional.ofNullable("hello");
        Optional<String> of = Optional.of("hello");

        String value = empty.orElseThrow(() -> new RuntimeException("There is no value"));
        System.out.println(value);
    }
}
