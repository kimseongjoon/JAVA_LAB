package CH12.collection.treemap;

import CH12.collection.Member;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        MemberTreeMap mem = new MemberTreeMap();
        mem.addMember(new Member(1003, "박서훤"));
        mem.addMember(new Member(1001, "이지원"));
        mem.addMember(new Member(1002, "손민국"));
        mem.addMember(new Member(1004, "홍길동"));

        mem.showAllMember();

        mem.removeMember(1004);
        mem.showAllMember();
    }
}
