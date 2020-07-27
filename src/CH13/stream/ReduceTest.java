package CH13.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BinaryOperator;

// 인터페이스 BinaryOperator를 구현한 클래스 정의
class CompareString implements BinaryOperator<String> {

    @Override // 두 개의 문자열의 길이를 비교하여 큰 것을 리턴
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greeting = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
        System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }));

        String str = Arrays.stream(greeting).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
