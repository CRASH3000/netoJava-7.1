package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void calcSumTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calcAverageSumTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calcAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void maxSalesTest() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(maxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSalesTest() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(minMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calcBelowAverageTest() {
        StatsService service = new StatsService();
        int[] amountMonthUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.calcBelowAverage(amountMonthUnderAvg);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcAboveAverageTest() {
        StatsService service = new StatsService();
        int[] amountMonthOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.calcAboveAverage(amountMonthOverAvg);

        Assertions.assertEquals(expected, actual);

    }

}
