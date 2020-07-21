package CH12.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        // 제네릭 클래스 객체 선언과 생성
        GenericPrinter<Powder> powderPrinter = new GenericPrinter();

        // Powder p1 = new Powder();
        // set 메소드 사용
        powderPrinter.setMaterial(new Powder()); // 객체의 필드변수 초기화

        // get 메소드 사용
        Powder powder =  powderPrinter.getMaterial();
        System.out.println(powderPrinter);
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
        // 제네릭 클래스 객체 선언과 생성
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter();

        // Plastic p1 = new Plastic();
        // set 메소드 사용
        plasticPrinter.setMaterial(new Plastic()); // 객체의 필드변수 초기화

        // get 메소드 사용
        Plastic plastic =  plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}