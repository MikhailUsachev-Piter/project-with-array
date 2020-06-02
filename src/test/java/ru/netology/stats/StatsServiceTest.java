package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumSales() {
        StatsService sumSales = new StatsService();
        int actual = sumSales.calculateSum(purchases);
        assertEquals(180, actual);
    }

    @Test
    void averageAmount() {
        StatsService averageAmount = new StatsService();
        int actual = averageAmount.calculateAverageAmount(purchases);
        assertEquals(15, actual);
    }

    @Test
    void salesHigherMiddle() {
        StatsService quantityHight = new StatsService();
        int actual = quantityHight.salesHigherMiddle(purchases);
        assertEquals(5, actual);
    }

    @Test
    void salesLowMiddle() {
        StatsService quantityLow = new StatsService();
        int actual = quantityLow.salesLowMiddle(purchases);
        assertEquals(5, actual);
    }

    @Test
    void monthMinSales() {
        StatsService minSales = new StatsService();
        int actual = minSales.calculateMin(purchases);
        assertEquals(9, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService maxSales = new StatsService();
        int actual = maxSales.calculateMax(purchases);
        assertEquals(8, actual);
    }
}