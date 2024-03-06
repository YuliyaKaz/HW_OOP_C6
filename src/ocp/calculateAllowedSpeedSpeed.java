package ocp;
/** интерфейс определения скорости */
public interface calculateAllowedSpeedSpeed {
    public default double calculateAllowedSpeed() {
        return 0.0;
    }
}
