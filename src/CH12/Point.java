package CH12;

// 두개의 제네릭 매개변수
public class Point<T, V> {
    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
