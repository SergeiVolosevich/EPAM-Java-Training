package by.epam.javatraining.volosevich.lesson05.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTest {

    @Test
    public void TestisVowelFirstVersionUpperCase() {
        char symbol = 'A';

        assertTrue(Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionLowerCase() {
        char symbol = 'e';

        assertTrue(Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionNegativeResult() {
        char symbol = 'K';

        assertFalse(Alphabet.isVowelFirstVersion(symbol));
    }

    @Test(timeout = 100)
    public void TestisVowelFirstVersionTimeout() {
        char symbol = 'u';

        assertTrue(Alphabet.isVowelFirstVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionUpperCase() {
        char symbol = 'E';

        assertTrue(Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionLowerCase() {
        char symbol = 'i';

        assertTrue(Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionNegativeResult() {
        char symbol = '-';

        assertFalse(Alphabet.isVowelSecondVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelSecondVersionTimeout() {
        char symbol = 'u';

        assertTrue(Alphabet.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionLowerCase() {
        char symbol = 'u';

        assertTrue(Alphabet.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionUpperCase() {
        char symbol = 'O';

        assertTrue(Alphabet.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionNegativeResult() {
        char symbol = '!';

        assertFalse(Alphabet.isVowelThirdVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelThirdVersionTimeout() {
        char symbol = 'u';

        assertTrue(Alphabet.isVowelThirdVersion(symbol));
    }
}