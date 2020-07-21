package CH12.generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 어레이리스트로 제네릭 테스트

        ArrayList<String> list = new ArrayList();
        list.add("문자열"); // String
//        list.add('A'); // Char
//        list.add(123); // int => Integer
//        list.add(3.14); // float => Float

        String str = list.get(0);
//        int number = (int) list.get(2);

        System.out.println(str);
//        System.out.println(number);
    }
}
