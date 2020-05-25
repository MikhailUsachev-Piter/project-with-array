package ru.netology.stats;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 20, 8, 19, 20, 16, 14, 14, 18};

    @Test
    void sumSales() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);
        assertEquals(180, sum);
    }

    @Test
    void averageAmount() {
        StatsService averageAmount = new StatsService();
        int averageSum = averageAmount.calculateAverageAmount(purchases);
        assertEquals(15, averageSum);
    }

    @Test
    void salesHigherMiddle() {
        StatsService quantityHight = new StatsService();
        int value = quantityHight.salesHigherMiddle(purchases);
        assertEquals(5, value);
    }

    @Test
    void salesLowMiddle() {
        StatsService quantityLow = new StatsService();
        int value = quantityLow.salesLowMiddle(purchases);
        assertEquals(5, value);
    }

    @Test
    void monthMinSales() {
        StatsService minSales = new StatsService();
        int month = minSales.calculateMin(purchases);
        assertEquals(6, month);
    }

    @Test
    void monthMaxSales() {
        StatsService maxSales = new StatsService();
        int month = maxSales.calculateMax(purchases);
        assertEquals(8, month);
    }
}