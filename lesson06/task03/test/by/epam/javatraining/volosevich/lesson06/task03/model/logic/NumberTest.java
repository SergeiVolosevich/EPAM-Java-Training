package by.epam.javatraining.volosevich.lesson06.task03.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void testCalcFactorial() {
        int number = 5;
        double expected = 120;

        assertEquals(expected, Number.calcFactorial(number), .0);
    }

    @Test
    public void testCalcFactorialByNegativeNumber() {
        int number = -5;
        double expected = 0;

        assertEquals(expected, Number.calcFactorial(number), .0);
    }

    @Test
    public void testCalcFactorialByInvalidValue() {
        int number = 171;
        double expected = 0;

        assertEquals(expected, Number.calcFactorial(number), .0);
    }

    @Test
    public void testCalcFactorialByZero() {
        int number = 0;
        double expected = 1;

        assertEquals(expected, Number.calcFactorial(number), .0);
    }

    @Test
    public void testCalcFactorialByOne() {
        int number = 1;
        double expected = 1;

        assertEquals(expected, Number.calcFactorial(number), .0);
    }

    @Test
    public void testCalcFactorialByMaxValue() {
        int number = 170;
        double expected = 7.257415615307994E306;

        assertEquals(expected, Number.calcFactorial(number), .00);
    }

}