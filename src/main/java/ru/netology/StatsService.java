package ru.netology;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverageSum(int[] sales) {
        int sum = calcSum(sales);
        int averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcBelowAverage(int[] sales) {
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcAboveAverage(int[] sales) {
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}
