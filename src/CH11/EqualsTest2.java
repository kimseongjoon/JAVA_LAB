package CH11;

public class EqualsTest2 {
    public static void main(String[] args) {
        Student lee = new Student(100, "이상원");
        Student lee2 = lee; // 주소복사
        Student sang = new Student(100, "이상원");
        Student kim = new Student(100, "김유신");

        if (lee.equals(lee2)) { // lee와 lee2 객체가 같은가?
            System.out.println("lee와 lee2는 동일합니다.");
        } else {
            System.out.println("lee와 lee2는 동일하지 않습니다.");
        }

        if (lee.equals(kim)) { // lee와 lee2 객체가 같은가?
            System.out.println("lee와 sang는 동일합니다.");
        } else {
            System.out.println("lee와 sang는 동일하지 않습니다.");
        }

        System.out.println("lee의 hashcode() : " + lee.hashCode());
        System.out.println("sang의 hashcode() : " + sang.hashCode());
        System.out.println("kim의 hashcode() : " + kim.hashCode());
    }
}
