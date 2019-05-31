package by.epam.javatraining.volosevich.lesson05.task03.model.logic;

import java.util.Random;

public class RandomNumber {

    private static Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt();
    }
}
