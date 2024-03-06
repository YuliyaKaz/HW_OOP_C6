package lsp;

/**
 * Класс Square для реализации принципа lsp
 * постусловия могут быть усилены
 */
public class Square implements Shape {
    private int side;

    /** set-метод для сторны квадрата */
    public void setSide(int side) {
        this.side = side;
    }

    /** площадь */
    @Override
    public int area() {
        return this.side * this.side;
    }
}