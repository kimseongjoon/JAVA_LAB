package CH12.generics;

public class Plastic extends Material{
    @Override
    public void doPrinting() { // 구현해야될 추상메소드
        System.out.println("Plastic 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "재료는 Plastic입니다.";
    }
}
