package ocp;

/** класс автомобиль */
public class Car extends Vehicle implements calculateAllowedSpeedSpeed {
    /** конструктор */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    /** определение допустимой скорости */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
