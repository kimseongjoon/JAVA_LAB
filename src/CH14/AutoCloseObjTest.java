package CH14;

class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        // 인터페이스의 close() 메소드 오버라이드
        System.out.println("리소스가 close()가 되었습니다.");
    }
}
public class AutoCloseObjTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 부분입니다");
        }
    }
}
