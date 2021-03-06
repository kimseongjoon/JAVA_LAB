package CH12.collection.hashmap;

import CH12.collection.Member;
import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    // 회원아이디(정수): 멤버객체
    private HashMap<Integer, Member> hashMap;

    // 생성자
    public MemberHashMap() {
        // 해쉬맵 객체를 생성
        hashMap = new HashMap<>();
    }

    //멤버를 해시맵에 추가 (아이디값, 멤버)
    public void addMember(Member member) {
        // 맵인터페이스에서는 add가 아니고 put을 사용
        hashMap.put(member.getMemberID(), member);
    }

    // 아이디 멤버 쌍의 값을 제거
    public boolean removeMember (int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 전체 회원 출력
    public void showAllMember() {
        // 해시맵의 키값으로 순서가 있는 객체 ir을 생성
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) { // 다음번 키값이 있을 때 true 반환
            int key = ir.next(); // 키값을 입력하고 다음번 순서로
            Member member = hashMap.get(key); // 키값(아이디)에 해당하는 멤버입력
            System.out.println(member); // 멤버 출력
        }
        System.out.println();
    }

    public void showAllMember2() {
        for (Integer key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
        System.out.println();
    }
}
