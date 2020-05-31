package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 20, 8, 19, 20, 16, 14, 14, 18};
    private int actual;

    @Test
    void sumSales() {
        StatsService sumSales = new StatsService();
        int sum = sumSales.calculateSum(purchases);
        assertEquals(180, actual);
    }

    @Test
    void averageAmount() {
        StatsService averageAmount = new StatsService();
        int averageSum = averageAmount.calculateAverageAmount(purchases);
        assertEquals(15, actual);
    }

    @Test
    void salesHigherMiddle() {
        StatsService quantityHight = new StatsService();
        int value = quantityHight.salesHigherMiddle(purchases);
        assertEquals(5, actual);
    }

    @Test
    void salesLowMiddle() {
        StatsService quantityLow = new StatsService();
        int value = quantityLow.salesLowMiddle(purchases);
        assertEquals(5, actual);
    }

    @Test
    void monthMinSales() {
        StatsService minSales = new StatsService();
        int month = minSales.calculateMin(purchases);
        assertEquals(6, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService maxSales = new StatsService();
        int month = maxSales.calculateMax(purchases);
        assertEquals(8, actual);
    }
}