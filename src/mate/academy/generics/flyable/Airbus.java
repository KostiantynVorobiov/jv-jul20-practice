package mate.academy.generics.flyable;

public class Airbus implements Flyable<Model> {
    @Override
    public Model getFlyModel() {
        return new Model();
    }
}
