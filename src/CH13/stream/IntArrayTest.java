package CH13.stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // 배열 arr

        // 스트림을 배열에 사용하여 결과값을 sum, count
        int sumVal = Arrays.stream(arr).sum(); // 배열 안 요소들의 합
        int count = (int) Arrays.stream(arr).count(); // count는 long

        System.out.println(sumVal);
        System.out.println(count);
    }
}
