package by.epam.javatraining.volosevich.lesson06.task01.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinLogicTest {

    @Test
    public void testCountHeadsLessZero() {
        int numberOfFlips = -100;
        int expected = -1;
        assertEquals(expected, CoinLogic.countHeads(numberOfFlips));
    }

    @Test
    public void testCountHeadsAndTailsEqualsZero() {
        int numberOfFlips = 0;
        int expected = 0;

        assertEquals(expected, CoinLogic.countHeads(numberOfFlips));
    }

    @Test
    public void testCountHeadsAndTailsMoreZero() {
        int numberOfFlips = 1000;

        assertTrue(CoinLogic.countHeads(1000) >= 0);
    }
}