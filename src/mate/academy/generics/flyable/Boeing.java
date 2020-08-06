package mate.academy.generics.flyable;

public class Boeing implements Flyable<String> {
    @Override
    public String getFlyModel() {
        return "777-MAX";
    }
}
