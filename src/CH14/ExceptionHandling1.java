package CH14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        FileInputStream fis = null;

        // 파일 입출력 예외처리
        try {
            fis = new FileInputStream("a.txt"); // 파일객체 생성
        } catch (FileNotFoundException e) {
            // 파일을 찾지 못했을 경우
            //e.printStackTrace();
            System.out.println(e); // 에러 출력
            return; // 프로그램 메인문 종료
        } finally {
//            System.out.println("파이널리문");
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("정상적으로 종료!");
    }
}
