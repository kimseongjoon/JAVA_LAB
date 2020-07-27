package CH13.lambda;

// 람다식을 사용하기 위해서 인터페이스와 추상메소드(1) 필요
@FunctionalInterface
interface MyNumber {
    int getMax (int num1, int num2); // 추상메소드
}

public class TestMyNumber {
    public static void main(String[] args) {
        // 인터페이스 max 선언하고 람다식 만들기
        MyNumber max = (x, y) -> (x >= y) ? x: y;

        System.out.println(max.getMax(10, 20));
    }
}
