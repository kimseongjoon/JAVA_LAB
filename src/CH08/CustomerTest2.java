package CH08;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        // ArrayList 선언
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer lee = new Customer(10010, "이순신");
        Customer shin = new Customer(10020, "신사임당");
        Customer hong = new GoldCustomer(10030, "홍길동");
        Customer youl = new GoldCustomer(10040, "이율곡");
        Customer kim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(lee);
        customerList.add(shin);
        customerList.add(hong);
        customerList.add(youl);
        customerList.add(kim);

        System.out.println("===고객정보출력===");
        for (Customer c : customerList) {
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("===할인율과 보너스 포인트 계산===");
        int price = 10000;
        for (Customer c : customerList) {
            int cost = c.calcPrice(price);
            System.out.println(c.showCustomerInfo() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(c.getCustomerName() + " 님의 현재 보너스 포인트는 " + c.bonusPoint + "점입니다.");
        }
    }
}
