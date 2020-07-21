package CH12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // TreeSet 리스트 1.중복안됨 2.정렬
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
