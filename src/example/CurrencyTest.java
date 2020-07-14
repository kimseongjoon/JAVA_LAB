package example;

public class CurrencyTest {
    public static void main(String[] args) {
        KRW krw = new KRW(1500, "원");
        USD usd = new USD(100.50, "달러");
        EUR eur = new EUR(260.87, "유로");
        JPY jpy = new JPY(1400, "엔");

        Currency[] currencies = {krw, usd, eur, jpy};

        for (Currency c : currencies) {
            System.out.println(c.toString());
        }
    }
}

class Currency {
    private double amount;
    private String notation;

    public Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    }

    public double getAmount() {
        return amount;
    }

    public String getNotation() {
        return notation;
    }

    public String toString() {
        return amount + " " + notation;
    }
}

class KRW extends Currency {
    public KRW(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("KRW: %.2f %s", super.getAmount(), super.getNotation());
        //return "KRW: " + super.toString();
    }
}

class USD extends Currency {
    public USD(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return "USD: " + super.toString();
    }
}

class EUR extends Currency {
    public EUR(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return "EUR: " + super.toString();
    }
}

class JPY extends Currency {
    public JPY(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return "JPY: " + super.toString();
    }
}