package mate.academy.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * - Declare the class as final so it can’t be extended.
 * - Make all fields private so that direct access is not allowed.
 * - Don’t provide setter methods for variables
 * - Make all mutable fields final so that it’s value can be assigned only once.
 * - Initialize all the fields via a constructor performing deep copy.
 * - Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */
public final class Car {
    private String model;
    private int year;
    private Engine engine;
    private List<String> owners;

    public Car(String model, int year, Engine engine, List<String> owners) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engine.getHorsePower(), engine.getType());
        this.owners = new ArrayList<>(owners);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return (Engine) engine.clone();
    }

    public List<String> getOwners() {
        return new ArrayList<>(owners);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(owners, car.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, engine, owners);
    }
}
