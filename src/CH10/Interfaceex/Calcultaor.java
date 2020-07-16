package CH10.Interfaceex;

public abstract class Calcultaor implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public void description() {
        System.out.println("디폴트메소드를 오버라이드함");
    }
}
