package org.example;

public class Lesson6_3_3 {
    /**
     * В 1626 году индейцы продали Манхэттен за 24$. Написать программу, которая
     * высчитывает сумму, получившуюся бы в текущем году, если бы индейцы положили
     * бы эти деньги в банк под 5% годовых.
     */
    static void main() {
        double amount = 24;
        double result = sum(amount);
        System.out.println(result);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int i = 1626 + 1; i <= 2025; i++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(i + ":" + result);
        }
        return result;
    }
}

