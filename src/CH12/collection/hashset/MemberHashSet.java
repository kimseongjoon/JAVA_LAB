package CH12.collection.hashset;

import CH12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet; // HashSet 선언

    public MemberHashSet() {
        hashSet = new HashSet<Member>(); // hashset 생성
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember (int memberID) {
        // Iterator 객체 만들기 hashSet.iterator()
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()) { // 다음 순서가 있을 경우에 계속 진행
            Member member = ir.next(); // 다음 순서 요소를 리턴
            int tempId = member.getMemberID(); // 아이디를 가져옴
            if (tempId == memberID) { // 아이디 비교하여 같으면
                hashSet.remove(member); //member 객체를 삭제
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
