package CH14;

import java.util.Scanner;

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class PWFormatTest {
    private String userPW;

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) throws PasswordException {
        if (userPW == null) {
            throw new PasswordException("Password는 null일 수 없습니다");
        } else if (userPW.matches("[a-zA-Z]+")) {
            throw new PasswordException("Password는 문자만 사용할 수 없습니다");
        } else if (userPW.length() <= 5) {
            throw new PasswordException("Password는 6자 이상으로 쓰세요");
        }

        this.userPW = userPW;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PWFormatTest test = new PWFormatTest();

        while(true)
        {
            System.out.println("비밀번호를 입력하세요(문자열과 숫자조합 5자 이상)");
            String userPW = input.nextLine();

            try {
                test.setUserPW(userPW);
            } catch (PasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}