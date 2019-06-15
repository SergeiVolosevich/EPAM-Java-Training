package by.epam.javatraining.volosevich.lesson06.task05.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsPrimeNumber() {
        int number = 89;

        assertTrue(NumberLogic.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByCompositeNumber() {
        int number = 44;

        assertFalse(NumberLogic.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByZero() {
        int number = 0;

        assertFalse(NumberLogic.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByOne() {
        int number = 1;

        assertFalse(NumberLogic.isPrimeNumber(number));
    }

    @Test
    public void testIsPrimeNumberByNegative() {
        int number = -20;

        assertFalse(NumberLogic.isPrimeNumber(number));
    }
}