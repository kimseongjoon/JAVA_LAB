package CH08;

public class VIPCustomer extends Customer{
    //추가 필드
    private int agentID;    //VIP 상담원 아이디
    double saleRatio;       //할인율

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;
        return (int) (price - price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        // 기존 showCustomerInfo는 고객이름과 아이디를 문자열로 리턴
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
    }
}
