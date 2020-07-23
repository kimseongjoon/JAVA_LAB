package CH12.collection.hashmap;

import CH12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap mem = new MemberHashMap();

        mem.addMember(new Member(1001, "이지원"));
        mem.addMember(new Member(1002, "손민국"));
        mem.addMember(new Member(1003, "박서훤"));
        mem.addMember(new Member(1004, "홍길동"));

        mem.showAllMember2();

        mem.removeMember(1004);
        mem.showAllMember2();
    }
}
