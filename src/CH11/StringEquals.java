package CH11;

public class StringEquals {
    public static void main(String[] args) {
        // String 클래스의 재정의된 equals를 확인!
        String str1 = new String("abc");
        //String str = "abcdefg";
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


    }
}