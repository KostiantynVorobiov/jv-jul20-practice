package mate.academy.generics;

import java.util.List;

public class Example<X> {
    public X getValue() {
        return value;
    }

    public Example () {

    }

    private Example(X value) {
        this.value = value;
    }

    public void setValue(X value) {
        this.value = value;
    }

    private X value;

    public static <X> Example<X> of(X value) {
        return new Example<>(value);
    }
}
