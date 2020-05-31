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
        for (int i = 0; i < purchases.length; i++) {
            int monthSale = purchases[i];
            if (minSales >= monthSale) {
                minSales = monthSale;
                month = i + 1;
            }
        }
        return month;
    }

    public int calculateMax(int[] purchases) {
        int maxSales = purchases[0];
        int month = 0;
        for (int i = 0; i < purchases.length; i++) {
            int monthSales = purchases[i];
            if (maxSales <= monthSales) {
                maxSales = monthSales;
                month = i + 1;
            }
        }
        return month;
    }
}