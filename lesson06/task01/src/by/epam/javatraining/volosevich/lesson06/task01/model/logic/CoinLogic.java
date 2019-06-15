package by.epam.javatraining.volosevich.lesson06.task01.model.logic;

import java.util.Random;

public class CoinLogic {
    private static final Random random = new Random();
    private static final int NUMBER_OF_SIDES = 2;


    public static int countHeads(int numberOfFlips) {
        if (numberOfFlips < 0) {
            return -1;
        }
        int quantityHeads = 0;
        for (int i = 0; i < numberOfFlips; i++) {
            if (random.nextInt(NUMBER_OF_SIDES) == 0) {
                quantityHeads++;
            }
        }
        return quantityHeads;
    }
}
