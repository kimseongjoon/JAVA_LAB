package CH13.innerclass;

class OutClass1 { // 내부클래스 외부의 클래스
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 스태틱 변수 (객체없이 사용)

    private InStaticClass inClass; // 내부클래스의 자료형 객체 변수

//    public OutClass1() { // 외부 클래스 만들시에 인클래스 객체 자동 생성
//        inClass = new InStaticClass();
//    }

    static class InStaticClass { // 내부 클래스
        int inNum = 100; // 내부클래스의 인스턴스 변수
        static int sInNum = 200;

        void inTest() {
            System.out.println("InStaticClass inNum = " + inNum + "(내부클래스 인스턴스 변수)");
            System.out.println("InStaticClass sNum = " + sInNum + "(내부클래스 정적변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        static void sTest() {
            // num += 10;
            // inNum += 10;
            System.out.println("Outclass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
        }
    }

    public void usingClass() {
        inClass.inTest(); // 내부 클래스의 instance 메소드 실행
    }
}

public class StaticInnerTest {
    public static void main(String[] args) {
        // 정적 내부 클래스는 외부 클래스를 생성하지 않고 이름만 가지고 생성
        OutClass1.InStaticClass sInClass = new OutClass1.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        // 일반 메소드는 객체 생성 후 객체이름.메소드
        sInClass.inTest();

        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        // 정적 메소드는 외부클래스이름.정적내부클래스이름.메소드사용
        OutClass1.InStaticClass.sTest();

    }
}
