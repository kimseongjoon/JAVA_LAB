package example;

public class WeightAfterFiveMonths {
    public static void main(String[] args) {
        double start = Double.parseDouble(args[0]);
        int after = Integer.parseInt(args[1]);

        double result = weight(start, after);

        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    private static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;

        for (int i = 0; i < months; i++) {
            expectedWeight += 0.231;
        }

        return expectedWeight;
    }
}
