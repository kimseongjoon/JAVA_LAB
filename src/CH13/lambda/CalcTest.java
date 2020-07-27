package CH13.lambda;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = (x, y) -> x + y;
        System.out.println("합은 : " + calc.add(3424, 23432));
    }
}
