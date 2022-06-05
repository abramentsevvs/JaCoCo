package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaximum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1000, 1500, 3000, 5000, 10000, 151515, 27980, 1255555, 25252567, 75600, 999999};
        long expected = 25252567;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}