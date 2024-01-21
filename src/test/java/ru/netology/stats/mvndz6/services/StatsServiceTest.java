package ru.netology.stats.mvndz6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void maxSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.TotalAmount(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.AverageAmount(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSale () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.getMaxMonthSale(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSale () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.getMinMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAvarage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.getMinAvarage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAvarage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.getMaxAvarage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
