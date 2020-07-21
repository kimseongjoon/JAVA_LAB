package CH12.collection;

import java.util.Objects;

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

    // hashset 중복을 id로 체크하기 위해서 equals와 hashcode를 재정의함


    @Override
    public boolean equals(Object obj) {
        Member other = (Member) obj;
        if (memberID == other.memberID) {
            return true; // 아이디가 같으면 true
        }
        return false; // 같지 않으면 false
    }

    @Override
    public int hashCode() {
        return memberID;
    }
}
