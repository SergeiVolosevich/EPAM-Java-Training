package by.epam.javatraining.volosevich.lesson05.task01.model.logic;

public class DragonLogic {

    private static final int NUMBER_HEADS_START = 3;
    private static final int NUMBER_OF_EYES = 2;
    private static final int NUMBER_HEADS_FIRST_PERIOD = 3;
    private static final int NUMBER_HEADS_SECOND_PERIOD = 2;
    private static final int NUMBER_HEADS_THIRD_PERIOD = 1;
    private static final int FIRST_AGE_PERIOD = 200;
    private static final int SECOND_AGE_PERIOD = 300;

    public static int countDragonHeads(int age) {
        int quantityHeads = 0;

        if (age >= 0) {

            if (age <= 200) {
                quantityHeads = NUMBER_HEADS_START + NUMBER_HEADS_FIRST_PERIOD * age;
            } else if (age <= 300) {
                return quantityHeads = NUMBER_HEADS_START + FIRST_AGE_PERIOD * NUMBER_HEADS_FIRST_PERIOD +
                        (age - FIRST_AGE_PERIOD)* NUMBER_HEADS_SECOND_PERIOD;
            } else {
                return quantityHeads = NUMBER_HEADS_START + FIRST_AGE_PERIOD * NUMBER_HEADS_FIRST_PERIOD +
                        (SECOND_AGE_PERIOD - FIRST_AGE_PERIOD)* NUMBER_HEADS_SECOND_PERIOD + NUMBER_HEADS_THIRD_PERIOD
                        * (age - SECOND_AGE_PERIOD);
            }

        } else {
            return quantityHeads;
        }
        return quantityHeads;
    }

    public static int countDragonEyes(int age) {
        return countDragonHeads(age) * NUMBER_OF_EYES;
    }
}
