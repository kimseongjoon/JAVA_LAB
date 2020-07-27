package CH13.lambda;

interface PrintString {
    void showString (String str);
}
public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lambda_1");
        showMyString(lambdaStr);
    }

    public static void showMyString (PrintString p) {
        p.showString("hello_lambda_2");
    }
}
