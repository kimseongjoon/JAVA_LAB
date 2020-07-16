package example;
//
//public class Main {
//    public static void main(String[] args) {
//        Juice j = new Juice();
//        j.name = "쥬스";
//        Coffee c = new Coffee();
//        c.name = "커피";
//        Beer b = new Beer();
//        b.name = "맥주";
//        Water w = new Water();
//        w.name = "생수";
//        Tea t = new Tea();
//        t.name = "티";
//
//        Drink[] drinks = {j, c, b, w, t};
//
//        for (Drink drink : drinks) {
//            drink.ordered();
//        }
//    }
//}
//
//class Drink {
//    String name;
//    double price;
//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
//}
//
//class Juice extends Drink {
//
//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
//}
//
//class Coffee extends Drink {
//    public void ordered() {
//        System.out.println(name + "주문되었습니다.");
//    }
//}
//
//class Beer extends Drink {
//    @Override
//    public void ordered() {
//        System.out.println(name + "주문되었습니다.");
//    }
//}
//
//class Water extends Drink {
//    @Override
//    public void ordered() {
//        System.out.println(name + "주문되었습니다.");
//    }
//}
//
//class Tea extends Drink {
//    @Override
//    public void ordered() {
//        System.out.println(name + "주문되었습니다.");
//    }
//}

public class Main {
    public static void main(String[] args) {
        Car1 c = new Car1("티코");
        Car1 t = new Truck("봉고", 1.5);

        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}

class Car1 {
    protected String name;

    public Car1(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("[자동차] { name: %s }", name);
    }
}

class Truck extends Car1 {
    protected double ton;

    public Truck(String name, double ton) {
        super(name);
        this.ton = ton;
    }

    @Override
    public String toString() {
        return String.format("[트럭] { name: %s, ton: %.1f }", name, ton);
    }
}