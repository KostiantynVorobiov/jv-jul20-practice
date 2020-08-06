package mate.academy.generics;

public class Box<T> {
    private T value;

    public void add(T value) {
        this.value = value;
    }
}
