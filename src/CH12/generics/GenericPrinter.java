package CH12.generics;

// 제네릭<> 클래스 만들기 : 클래스 이름 뒤에 <T>
public class GenericPrinter<T extends Material> {
    private T material; // 변수는 T타입형

    // 메소드 T타입 매개변수를 가짐 => material을 초기화
    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() { // 메소드 T타입 리턴값을 가짐
        return material;
    }

    @Override
    public String toString() { // T객체의 toString메소드
        return material.toString();
    }
}
