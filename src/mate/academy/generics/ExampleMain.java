package mate.academy.generics;

import java.io.Closeable;

public class ExampleMain {
    public static void main(String[] args) {
        Example<Closeable> exampleClosable;
        Example<DayOfWeeks> dayOfWeeksExample = new Example<>();
        Example<?> wildcardExample;
        Example<Object> objectExample;

        // no parametrization
        Example notParametrizedClass = new Example();
        notParametrizedClass.setValue(new Object());

        dayOfWeeksExample.setValue(DayOfWeeks.MONDAY);

        Example<String> hello = Example.of("Hello");
    }
}
