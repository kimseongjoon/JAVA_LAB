package example.AbsAndInter;

public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}

interface Meter {
    public int BASE_FARE = 3000;
    public void start();
    public void stop(int distance);
}

class Taxi implements Meter {

    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public void stop(int distance) {
        int fee;
        fee = BASE_FARE + (distance * 2);

        System.out.println("운행을 종료합니다. 요금은 " + fee  + "원 입니다.");
    }
}
