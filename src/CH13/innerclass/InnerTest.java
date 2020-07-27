package CH13.innerclass;

class OutClass { // 내부클래스 외부의 클래스
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 스태틱 변수 (객체없이 사용)

    private InClass inClass; // 내부클래스의 자료형 객체 변수

    public OutClass() { // 외부 클래스 만들시에 인클래스 객체 자동 생성
        inClass = new InClass();
    }

    public class InClass { // 내부 클래스
        int inNum = 100; // 내부클래스의 인스턴스 변수
        //static int sInNum = 200;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부클래스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부클래스 정적변수)");
        }
    }

    public void usingClass() {
        inClass.inTest(); // 내부 클래스의 instance 메소드 실행
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass1 = new OutClass();
        System.out.println("외부클래스 이용하여 내부클래스 기능 호출");
        outClass1.usingClass();

        // 내부클래스 생성 사용방법
        OutClass out = new OutClass(); // 외부 클래스 생성
        OutClass.InClass in = out.new InClass(); //
    }
}
