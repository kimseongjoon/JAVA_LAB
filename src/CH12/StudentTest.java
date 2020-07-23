package CH12;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        // Set 인터페이스는 List와 달리 중복을 허용치 않음
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("100", "홍길동"));
        set.add(new Student("200", "강감찬"));
        set.add(new Student("300", "이순신"));
        set.add(new Student("400", "정약용"));
        set.add(new Student("100", "송중기"));

        System.out.println(set);
    }
}
