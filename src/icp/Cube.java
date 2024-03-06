package icp;
/** Класс куб реализует два интерфейса -  */
public class Cube implements Shape,  
                             Volume {
    private int edge;
    /** конструктор */
    public Cube(int edge) {
        this.edge = edge;
    }
    /** вычисление площади */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /** Вычисление объема */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}