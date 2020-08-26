package mate.academy.solid.model;

public class ElectroBike extends AbstractBike {
    public static final String TYPE = "ELECTRO";
    private int power;

    public ElectroBike() {
        super(TYPE);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
