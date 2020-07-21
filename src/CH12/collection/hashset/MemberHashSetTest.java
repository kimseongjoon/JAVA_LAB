package CH12.collection.hashset;

import CH12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");
        Member park = new Member(1003, "박서훤");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(son);
        memberHashSet.addMember(park);
        memberHashSet.showAllMember();

        Member hong = new Member(1003, "홍길동");
        memberHashSet.addMember(hong);
        memberHashSet.showAllMember();

        Member x = new Member(1005, "이순신");
        memberHashSet.addMember(x);
        memberHashSet.addMember(x);
        memberHashSet.addMember(x);
        memberHashSet.showAllMember();
    }
}