package CH12.collection.arraylist;

import CH12.collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;


    // 생성자 생성될 때 빈 어레이리스트 arrayList를 생성
    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    // member객체를 arrayList에 추가함
    public void addMember (Member member) {
        arrayList.add(member); // 객체를 arrayList에 추가
    }


    // memberID를 가지고 멤버객체중 같은 아이디를 제거
    public boolean removeMember (int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberID();
            if (tempId == memberId) {
                arrayList.remove(i); // i번째 인덱스 데이터를 제거
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 모든 멤버를 출력
    public void showAllMember() {
        for (Member member : arrayList) { // 어레이리스트의 모든 member 객체를
            System.out.println(member);   // 출력
        }
        System.out.println();
    }
}
