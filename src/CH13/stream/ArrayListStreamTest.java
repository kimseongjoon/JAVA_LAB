package CH13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        //어레이 리스트 sList 생성
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack"); // 요소 추가

        // 1
        Stream<String> stream = sList.stream(); // 스트림 생성
        stream.forEach(s->System.out.print(s + " "));
        System.out.println();

        // 2           // sorted() 알파벳 순 정렬
        sList.stream().sorted().forEach(s->System.out.println(s));
    }
}
