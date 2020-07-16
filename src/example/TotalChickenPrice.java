package example;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        order.add(new Chicken("로스트 치킨", 9900));
        order.add(new Chicken("파닭 치킨", 12900));
        order.add(new Chicken("마늘아 치킨", 13900));

        int sum = 0;
        for (Chicken chicken : order) {
            sum += chicken.getPrice();
        }

        System.out.printf("총합: %d원\n", sum);
    }
}


class Chicken {
    private String name;
    private int price;

    public Chicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}