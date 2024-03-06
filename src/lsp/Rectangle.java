package lsp;
/**
 * класс Rectangle для реализации принципа lsp
 */
public class Rectangle implements Shape {
    private int width;
    private int height;

    /** set-метод для стороны прямоугольника  */
    public void setWidth(int width) {
        this.width = width;
    }
    /** set-метод для стороны прямоугольника  */
    public void setHeight(int height) {
        this.height = height;
    }
    /** площадь прямоугольника  */
    @Override
    public int area() {
        return this.width * this.height;
    }
}

