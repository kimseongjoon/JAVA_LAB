package CH13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        // 여행객의 여행 비용 계산하기
        TravelCustomer lee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer kim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer hong = new TravelCustomer("홍길동", 13, 50);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(lee);
        customerList.add(kim);
        customerList.add(hong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream()                           // 스트림 생성
                .map(c -> c.getName())                  // 중간연산
                .forEach(s -> System.out.println(s));   // 각각의 고객의 이름

        int total = customerList.stream()               // 스트림 생성
                .mapToInt(c -> c.getPrice())            // 스트림을 인트형으로 수정
                .sum();                                 // 고객의 가격을 합한 값
        System.out.println("총 여행 비용은 : " + total + "입니다.");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream()                           // 스트림 생성
                .filter(c -> c.getAge() >= 20)          // 스트림 요소중 필터로 20세 이상만
                .map(c -> c.getName())                  // 이름을 가져옴
                .sorted()                               // 이름으로 정렬
                .forEach(s -> System.out.println(s));   // 각각의 이름을 출력
    }
}
