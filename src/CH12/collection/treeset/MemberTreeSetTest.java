package CH12.collection.treeset;

import CH12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet mem = new MemberTreeSet();

        // 1.아이디 중복체크 2.아이디순으로 정렬
        mem.addMember(new Member(1003, "박서휜"));
        mem.addMember(new Member(1001, "이지원"));
        mem.addMember(new Member(1002, "손민국"));

        mem.showAllMember();

        mem.addMember(new Member(1003, "홍길동"));
        mem.showAllMember();
    }
}
