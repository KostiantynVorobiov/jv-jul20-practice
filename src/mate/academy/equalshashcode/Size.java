package mate.academy.equalshashcode;

import java.util.Objects;

public class Size {
    private String color;
    private int value;
    private Long data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return value == size.value &&
                Objects.equals(color, size.color) &&
                Objects.equals(data, size.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value, data);
    }
}
