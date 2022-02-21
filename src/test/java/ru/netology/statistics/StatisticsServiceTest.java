package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void shouldfindMax() {

        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
//    @Test
//    void shouldfindMaxComplete() {
//
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 13, 1, 18, 6, 7, 10, 11, 20};
//        long expected = 20;
//
//        long actual = service.findMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//
//    }

}