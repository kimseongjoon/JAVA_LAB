package example;

import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        Menu menu1 = new Menu("김밥", 2000, 57);
        Menu menu2 = new Menu("돈까스", 6000, 29);
        Menu menu3 = new Menu("냉면", 5000, 34);

        Store store = new Store();

        store.add(menu1);
        store.add(menu2);
        store.add(menu3);

        System.out.println("총 매출: " + store.totalSales() + "원");
    }
}

class Store {
    private ArrayList<Menu> list;

    public Store() {
        this.list = new ArrayList<Menu>();
    }

    public void add(Menu menu) {
        list.add(menu);
    }

    public int totalSales() {
        int total = 0;

        for (Menu menu : list) {
            total += menu.getPrice() * menu.getCount();
        }

        return total;
    }
}

class Menu {
    private String name;
    private int price;
    private int count;

    public Menu(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}