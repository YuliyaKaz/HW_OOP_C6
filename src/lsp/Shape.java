package lsp;

/**
 * интерфейс Shape содержит общие методы для дочерних классов
 */
public interface Shape {
    public default int area() {
        return 0;
    }
}