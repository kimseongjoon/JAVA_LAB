package CH11;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "abc"; // 상수풀 메모리에 저장(문자열 같을시 같은 주소)
        String str4 = "abc"; // 상수풀 메모리에 저장(문자열 같을시 같은 주소)

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

    }
}
