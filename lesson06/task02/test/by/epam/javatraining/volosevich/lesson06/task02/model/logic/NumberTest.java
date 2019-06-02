package by.epam.javatraining.volosevich.lesson06.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void tesIsIncreasingSequence() {
        int number = 12345;

        assertTrue(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByZero() {
        int number = 0;

        assertFalse(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNine() {
        int number = 9;

        assertFalse(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNegative() {
        int number = -1357;

        assertTrue(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNegativeNine() {
        int number = -9;

        assertFalse(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNotOrder() {
        int number = 123056789;

        assertFalse(Number.isIncreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequence() {
        int number = 54321;

        assertTrue(Number.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByZero() {
        int number = 0;

        assertFalse(Number.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNine() {
        int number = 9;

        assertFalse(Number.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNegative() {
        int number = -1357;

        assertFalse(Number.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNegativeNine() {
        int number = -9;

        assertFalse(Number.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNotOrder() {
        int number = 129376;

        assertFalse(Number.isDecreasingSequence(number));
    }
}