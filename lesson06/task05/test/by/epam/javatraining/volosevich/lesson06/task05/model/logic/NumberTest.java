package by.epam.javatraining.volosevich.lesson06.task05.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void testIsPrimeNumber() {
        int number = 89;

        assertTrue(Number.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByCompositeNumber() {
        int number = 44;

        assertFalse(Number.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByZero() {
        int number = 0;

        assertFalse(Number.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByOne() {
        int number = 1;

        assertFalse(Number.isPrimeNumber(number));
    }
}