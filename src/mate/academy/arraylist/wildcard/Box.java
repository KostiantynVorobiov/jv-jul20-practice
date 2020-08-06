package mate.academy.arraylist.wildcard;

import java.util.Objects;

public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<T> box = (Box<T>) o; // TODO: find why by default was used wildcard: Box<?> box = (Box<?>) o;
        T value = box.value; // TODO: find the case when ClassCastException can occur
        return Objects.equals(this.value, box.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
