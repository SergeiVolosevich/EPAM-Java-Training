package by.epam.javatraining.volosevich.lesson06.task04.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsDigitsEven() {
        int number = 24688;
        assertTrue(NumberLogic.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByZero() {
        int number = 0;
        assertFalse(NumberLogic.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByNegative() {
        int number = -10;
        assertFalse(NumberLogic.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByBoundaryValue() {
        int number = 10886;
        assertFalse(NumberLogic.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsEvenByOdd() {
        int number = 135;
        assertFalse(NumberLogic.isDigitsEven(number));
    }

    @Test
    public void testIsDigitsOdd() {
        int number = 135793;

        assertTrue(NumberLogic.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByZero() {
        int number = 0;

        assertFalse(NumberLogic.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByNegative() {
        int number = -50;

        assertFalse(NumberLogic.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByBoundaryValue() {
        int number = 229755;

        assertFalse(NumberLogic.isDigitsOdd(number));
    }

    @Test
    public void testIsDigitsOddByEven() {
        int number = 24486;

        assertFalse(NumberLogic.isDigitsOdd(number));
    }
}