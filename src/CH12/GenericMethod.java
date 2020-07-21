package CH12;

import java.util.ArrayList;

public class GenericMethod {
    // 스테틱 메소드 (객체없이 바로 사용가능)
    public static <T, V> double makeR (Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left; // 가로 길이
        double height = bottom - top; // 세로 길이

        return width * height; // 사각형의 넓이 리턴 (실수)
    }

    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double result = GenericMethod.makeR(p1, p2);
        System.out.println("두 점으로 만들어진 삼각형의 넓이는 " + result + "입니다.");

        ArrayList<String> list = new ArrayList<>();
    }
}
