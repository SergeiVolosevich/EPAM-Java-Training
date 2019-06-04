package by.epam.javatraining.volosevich.lesson06.task01.model.logic;

import by.epam.javatraining.volosevich.lesson06.task01.model.data.Data;

import java.util.Random;

public class Coin {
    private static final Random random = new Random();
    private static final int NUMBER_OF_SIDES = 2;

    private Data data = new Data();

    public void countHeadsAndTails(int numberOfFlips) {
        int quantityHeads = 0;
        int quantityTails = 0;
        if (numberOfFlips >= 0) {
            for (int i = 0; i < numberOfFlips; i++) {
                if (random.nextInt(NUMBER_OF_SIDES) == 0) {
                    quantityHeads++;
                } else {
                    quantityTails++;
                }
            }
        } else {
            quantityHeads = -1;
            quantityTails = -1;
        }
        data.setQuantityTails(quantityTails);
        data.setQuantityHeads(quantityHeads);
    }

    public Data getData() {
        return data;
    }
}
