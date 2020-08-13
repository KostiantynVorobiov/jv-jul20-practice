package mate.academy.immutable;

import java.util.Objects;

public class Engine implements Cloneable {
    private int horsePower;
    private String type;

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public Engine() {
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone()  {
        return new Engine(horsePower, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePower == engine.horsePower &&
                Objects.equals(type, engine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, type);
    }
}
