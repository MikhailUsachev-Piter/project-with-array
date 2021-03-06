package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sumSales = 0;
        for (int index : purchases) {
            sumSales += index;
        }
        return sumSales;
    }

    public int calculateAverageAmount(int[] purchases) {
        int averageSum = calculateSum(purchases) / purchases.length;
        return averageSum;
    }

    public int salesHigherMiddle(int[] purchases) {
        int averageSum = calculateAverageAmount(purchases);
        int quantityHight = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum < purchases[i])
                quantityHight++;
        }
        return quantityHight;
    }

    public int salesLowMiddle(int[] purchases) {
        int averageSum = calculateAverageAmount(purchases);
        int quantitylow = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (averageSum > purchases[i])
                quantitylow++;
        }
        return quantitylow;
    }

    public int calculateMin(int[] purchases) {
        int minSales = purchases[0];
        int month = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (minSales > purchases[i]) {
                minSales = purchases[i];
                month = i;
            }
        }
        return month + 1;
    }

    public int calculateMax(int[] purchases) {
        int maxSales = purchases[0];
        int month = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (maxSales <= purchases[i]) {
                maxSales = purchases[i];
                month = i;
            }
        }
        return month + 1;
    }
}