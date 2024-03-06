package ocp;

/** Класс автобус */
public class Bus extends Vehicle implements calculateAllowedSpeedSpeed {
    /** конструктор */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /** Определние допустимой скорости */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }

}
