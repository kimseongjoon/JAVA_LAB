package CH11;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y =" + y;
    }
}

class Circle implements Cloneable { // clone 할 수 있도록
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    @Override
    public String toString() { // toString 재정의
        return "원점은 " + point // point의 toString 메소드 실행
                + "이고, 반지름은 " + radius + "입니다.";

    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle (10, 20, 30);
        Circle copyCircle = circle.clone();

        System.out.println(circle); // circle.toString()
        System.out.println(copyCircle); // copyCircle.toString()
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
