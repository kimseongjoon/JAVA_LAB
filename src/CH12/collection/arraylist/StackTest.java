package CH12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push (String data) {
        arrayStack.add(data); // 리스트에 맨 뒤쪽에 data를 추가
    }

    public String pop() {
        int len = arrayStack.size(); // 리스트의 길이(요소의 개수)를 len에 저장
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null; // 아무것도 없음
        }

        return (arrayStack.remove(len - 1)); // 인덱스번호는 len-1까지
    }
}
public class StackTest {
    public static void main(String[] args) {
        // stack 객체 생성 => 어레이리스트 자동 생성
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C"); // A, B, C순으로 입력됨

        System.out.println(stack.pop()); // 마지막 요소 'C'
        System.out.println(stack.pop()); // 마지막 요소 'B'
        System.out.println(stack.pop()); // 마지막 요소 'A'
        System.out.println(stack.pop()); // 스택이 비었습니다.
    }
}
