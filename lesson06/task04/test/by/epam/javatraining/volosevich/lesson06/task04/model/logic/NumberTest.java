package by.epam.javatraining.volosevich.lesson06.task04.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void testIsDigitsEven() {
        int number = 24688;
        assertTrue(Number.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByNegative() {
        int number = -1;
        assertFalse(Number.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByBoundaryValue() {
        int number = 10886;
        assertFalse(Number.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByOdd() {
        int number = 135;
        assertFalse(Number.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsOdd() {
        int number = 135793;

        assertTrue(Number.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByNegative() {
        int number = -50;

        assertFalse(Number.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByBoundaryValue() {
        int number = 229755;

        assertFalse(Number.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByEven() {
        int number = 24486;

        assertFalse(Number.isDigitsOdd(number));
    }
}