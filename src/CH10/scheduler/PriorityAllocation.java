package CH10.scheduler;
// 고객등급이 높은 고객 전화부터 가져와서 업무능력이 높은 상담원부터 배분
public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill이 높은 상담원에게 우선적 배분");
    }
}
