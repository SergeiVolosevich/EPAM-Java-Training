package by.epam.javatraining.volosevich.lesson06.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void tesIsIncreasingSequence() {
        int number = 12345;

        assertTrue(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByZero() {
        int number = 0;

        assertFalse(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNine() {
        int number = 9;

        assertFalse(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNegative() {
        int number = -1357;

        assertTrue(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNegativeNine() {
        int number = -9;

        assertFalse(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceByNotOrder() {
        int number = 123056789;

        assertFalse(NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequence() {
        int number = 54321;

        assertTrue(NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByZero() {
        int number = 0;

        assertFalse(NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNine() {
        int number = 9;

        assertFalse(NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNegative() {
        int number = -1357;

        assertFalse(NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNegativeNine() {
        int number = -9;

        assertFalse(NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceByNotOrder() {
        int number = 129376;

        assertFalse(NumberLogic.isDecreasingSequence(number));
    }
}