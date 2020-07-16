package CH10.Interfaceex;

public interface Calc {
    double PI = 3.14; // 상수
    int ERROR = 999999999; // 상수

    // 추상메소드
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }
    //정적(Static)메소드

    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
