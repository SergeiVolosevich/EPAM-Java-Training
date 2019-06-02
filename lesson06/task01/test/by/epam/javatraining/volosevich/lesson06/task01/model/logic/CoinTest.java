package by.epam.javatraining.volosevich.lesson06.task01.model.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {

    private Coin coin;

    @Before
    public void createCoin() {
        coin = new Coin();
    }

    @Test
    public void testCountHeadsAndTailsLessZero() {
        int numberOfFlips = -100;
        coin.countHeadsAndTails(numberOfFlips);
        assertTrue(coin.getData().getQuantityHeads() < 0 && coin.getData().getQuantityTails() < 0);
    }

    @Test
    public void testCountHeadsAndTailsEqualsZero() {
        int numberOfFlips = 0;
        coin.countHeadsAndTails(numberOfFlips);

        assertTrue(coin.getData().getQuantityHeads() == 0 && coin.getData().getQuantityTails() == 0);
    }

    @Test
    public void testCountHeadsAndTailsMoreZero() {
        int numberOfFlips = 1000;
        coin.countHeadsAndTails(numberOfFlips);

        assertTrue(coin.getData().getQuantityTails() > 0 && coin.getData().getQuantityHeads() > 0);
    }

    @Test
    public void testCountHeadsAndTailsSum() {
        int numberOfFlips = 1000;

        coin.countHeadsAndTails(numberOfFlips);
        int expected = coin.getData().getQuantityHeads() + coin.getData().getQuantityTails();

        assertEquals(expected, numberOfFlips);
    }

    @Test
    public void testGetData() {
        assertNotNull(coin.getData());
    }
}