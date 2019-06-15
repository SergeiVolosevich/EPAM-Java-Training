package by.epam.javatraining.volosevich.lesson05.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetLogicTest {

    @Test
    public void TestisVowelFirstVersionUpperCase() {
        char symbol = 'A';

        assertTrue(AlphabetLogic.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionLowerCase() {
        char symbol = 'e';

        assertTrue(AlphabetLogic.isVowelFirstVersion(symbol));
    }

    @Test
    public void TestisVowelFirstVersionNegativeResult() {
        char symbol = 'K';

        assertFalse(AlphabetLogic.isVowelFirstVersion(symbol));
    }

    @Test(timeout = 100)
    public void TestisVowelFirstVersionTimeout() {
        char symbol = 'u';

        assertTrue(AlphabetLogic.isVowelFirstVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionUpperCase() {
        char symbol = 'E';

        assertTrue(AlphabetLogic.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionLowerCase() {
        char symbol = 'i';

        assertTrue(AlphabetLogic.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelSecondVersionNegativeResult() {
        char symbol = '-';

        assertFalse(AlphabetLogic.isVowelSecondVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelSecondVersionTimeout() {
        char symbol = 'u';

        assertTrue(AlphabetLogic.isVowelSecondVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionLowerCase() {
        char symbol = 'u';

        assertTrue(AlphabetLogic.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionUpperCase() {
        char symbol = 'O';

        assertTrue(AlphabetLogic.isVowelThirdVersion(symbol));
    }

    @Test
    public void testIsVowelThirdVersionNegativeResult() {
        char symbol = '!';

        assertFalse(AlphabetLogic.isVowelThirdVersion(symbol));
    }

    @Test(timeout = 100)
    public void testIsVowelThirdVersionTimeout() {
        char symbol = 'u';

        assertTrue(AlphabetLogic.isVowelThirdVersion(symbol));
    }
}