package CH11;

public class StringBuilderTest {
    public static void main(String[] args) {
        // StringBuilder 클래스 사용 예제
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산전 buffer 메모리주소 : " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!!");
        System.out.println("연산후 buffer 메모리주소 : " + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
