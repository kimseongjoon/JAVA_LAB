package CH14;

// 사용자 예외처리 클래스 생성 (Exception 상속)
class IDFormatException extends Exception {
    // 예외생성시 메세지 입력하여
    public IDFormatException(String message) {
        super(message); // 메세지를 Exception에서 처리
    }
}

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    // 예외를 정의하는 메소드 만들기 (사용자 정의한 예외 발생시 => 호출하여 처리)
    public void setUserID(String userID) throws IDFormatException{
        if (userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다");
        }
        //        // 아이디 길이를 체크하여 8자리보다 작거나 20자리보다 클 경우
        else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }

        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567";

        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}