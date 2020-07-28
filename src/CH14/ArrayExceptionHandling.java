package CH14;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        // 예외처리 : try-catch문 사용하기
        int[] arr = new int[5]; // 인덱스가 0~4인 5개 정수배열
        int[] arr1 = {1, 2, 0, 4, 5};
        try { // 에러가 발생할 수 있는 코드를 적음
            for (int i = 0; i <= 5; i++) { // 0 ~5 까지 반복 인덱스 5일때
                arr[i] = i;
                System.out.println(arr[i]);
                System.out.println(arr[i] / arr1[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) { // 인덱스 번호
            System.out.println(e); // 에러 객체 정보 출력
            System.out.println("인덱스 번호 오류");
        } catch (ArithmeticException e) {
            System.out.println(e); // 에러 객체 정보 출력
            System.out.println("0으로 나눈 오류");
        } finally {
            System.out.println("에러가 발생하든 안하든 실행");
        }
        System.out.println("프로그램 종료");
    }
}
