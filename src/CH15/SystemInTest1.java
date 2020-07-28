package CH15;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) throws IOException {
        // 표준 입출력 : in
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            i = System.in.read();   // read 한 바이트 읽음
            System.out.println(i);  // 읽은 값을 출력
            System.out.println((char)i);    // 문자형으로 변환해서 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
