package ocp;

/** Класс транспортное средство */
public class Vehicle {
    int maxSpeed;
    String type;

    /** конструктор */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /** getter-метод для максимальной скорости */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /** getter-метод для типа транспортного средства */
    public String getType() {
        return this.type;
    }
}
