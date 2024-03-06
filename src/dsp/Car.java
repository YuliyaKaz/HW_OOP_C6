package dsp;
/** класс автомобиль */
public class Car {
    //класс зависит  от абстракции Engine
    private Engine engine;

    /** конструктор */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /** запуск */
    public void start() {
        this.engine.start();
    }
}

