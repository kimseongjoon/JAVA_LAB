package CH15;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        // 표준 입출력 : in
        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            // system.in.read는 한 바이트씩 읽기 때문에 while문으로 반복해서 읽어온 값이 -1일때 (더이상 읽을 것이 없을때)
            while ((i = System.in.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
