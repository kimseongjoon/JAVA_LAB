package CH09;

public class Constant {
    int num = 10;
    static final int NUM = 100; // 상수 선언시 대문자로

    public static void main(String[] args) {
        // static은 객체 생성없이 클래스명으로 사용
        System.out.println(Constant.NUM);
        Constant cons = new Constant();
        cons.num = 50;
        //cons.NUM = 200; // 상수는 값을 대입 불가

        System.out.println(cons.num);
        System.out.println(cons.NUM);

        System.out.println(Math.PI);
        //Math.PI = 3.145; // 수정불가
    }
}
