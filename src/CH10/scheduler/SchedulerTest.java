package CH10.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원이 선택한 전화 먼저 할당");

        int ch = System.in.read();  // 콘솔에 입력을 받음
        Scheduler scheduler = null; // 업캐스팅으로 사용할려고
                                    // 널값은 주소가 없음
        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRonin(); // 업캐스팅
        }
        else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else if (ch == 'A' || ch == 'a') {
            scheduler = new AgentGetCall();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
