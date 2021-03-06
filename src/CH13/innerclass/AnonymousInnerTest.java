package CH13.innerclass;

class Outer1 {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                //num = 200;
                //i = 10;
                System.out.println(i);
                System.out.println(num);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };

    Runnable runner2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("익명 클래스 2 만들기");
        }
    };

    Runnable runner3 = () -> System.out.println("람다식 만들기");
}

public class AnonymousInnerTest { // 익명 내부클래스 테스트
    public static void main(String[] args) {
        Outer1 out = new Outer1();
        Runnable runnable = out.getRunnable(10);
        runnable.run();
        out.runner.run();
        out.runner2.run();
        out.runner3.run();
    }
}
