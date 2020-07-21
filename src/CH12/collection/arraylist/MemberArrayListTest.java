package CH12.collection.arraylist;

import CH12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        // 앞에서 만든 MemberArrayList 테스트
        MemberArrayList mem = new MemberArrayList();

        // 회원추가
        Member lee = new Member(1001, "이지원");
        mem.addMember(lee);
        mem.addMember(new Member(1002, "손민국"));
        mem.addMember(new Member(1003, "박서훤"));
        mem.addMember(new Member(1004, "홍길동"));

        // 전체회원 출력
        mem.showAllMember();

        // 홍길동 회원 삭제
        mem.removeMember(1004);
        mem.showAllMember();
    }
}
