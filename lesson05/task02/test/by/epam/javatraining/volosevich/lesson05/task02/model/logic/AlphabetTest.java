package by.epam.javatraining.volosevich.lesson05.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTest {

    @Test
    public void TestisVowelFirstVersionUpperCase() {
        char symbol = 'A';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionLowerCase() {
        char symbol = 'e';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionNegativeResult() {
        char symbol = 'K';
        boolean expected = false;

        assertEquals(expected, Alphabet.isVowelFirstVersion(symbol));
    }

    @Test(timeout = 100)
    public void TestisVowelFirstVersionTimeout() {
        char symbol = 'u';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionUpperCase() {
        char symbol = 'E';

        assertTrue(Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionLowerCase() {
        char symbol = 'i';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionNegativeResult() {
        char symbol = '-';
        boolean expected = false;

        assertEquals(expected, Alphabet.isVowelSecondVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelSecondVersionTimeout() {
        char symbol = 'u';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionLowerCase() {
        char symbol = 'u';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionUpperCase() {
        char symbol = 'O';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionNegativeResult() {
        char symbol = '!';
        boolean expected = false;

        assertEquals(expected, Alphabet.isVowelThirdVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelThirdVersionTimeout() {
        char symbol = 'u';
        boolean expected = true;

        assertEquals(expected, Alphabet.isVowelThirdVersion(symbol));
    }
}