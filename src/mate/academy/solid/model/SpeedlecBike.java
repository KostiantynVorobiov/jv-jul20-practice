package mate.academy.solid.model;

public class SpeedlecBike extends AbstractBike {
    public static final String TYPE = "SPEEDELEC";

    private int maxSpeed;

    public SpeedlecBike() {
        super(TYPE);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
