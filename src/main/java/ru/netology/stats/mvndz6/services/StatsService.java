package ru.netology.stats.mvndz6.services;

public class StatsService {

    public long TotalAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long AverageAmount(long[] sales) {
        long average = TotalAmount(sales) / sales.length;
        return average;
    }

    public int getMaxMonthSale(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getMinAvarage(long[] sales) {
        int counter = 0;
        long average = AverageAmount(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int getMaxAvarage(long[] sales) {
        int counter = 0;
        long average = AverageAmount(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}