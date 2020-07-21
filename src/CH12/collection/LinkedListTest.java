package CH12.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // LinkedList 테스트
        LinkedList<String> myList = new LinkedList<>();

        // 추가하기
        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);

        myList.add(1, "D");
        System.out.println(myList); // 인덱스번호, 추가할 객체

        myList.addFirst("O"); // 제일 앞에 추가
        System.out.println(myList);

        System.out.println(myList.removeLast()); // 마지막순서 제거
        System.out.println(myList);
    }
}
