package CH08;

public class VIPCustomer1 {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;
    //추가 필드
    private int agentID;    //VIP 상담원 아이디
    double saleRatio;       //할인율

    public VIPCustomer1() {
        customerGrade = "VIP";  // VIP
        bonusRatio = 0.05;      // 적립비율
        saleRatio = 0.1;
    }

    //메소드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }
}
