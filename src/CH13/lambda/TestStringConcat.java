package CH13.lambda;

interface StringConcat {
    public void makeString (String s1, String s2);
}

class StringConcatEx implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
    }
}

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatEx concat1 = new StringConcatEx();
        concat1.makeString(s1, s2);
        // 람다식으로 인터페이스의 메소드 makeString을 구현
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);
    }
}
