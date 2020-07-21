package CH12.collection;

public class Member {
    private int memberID; // 회원 ID
    private String memberName; // 회원 이름

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    // get set 메소드 자동 생성
    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberID + "입니다";
    }
}
