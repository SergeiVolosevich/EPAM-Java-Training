package by.epam.javatraining.volosevich.lesson05.task01.model.logic;

public class DragonLogic {

    private static final int NUMBER_HEADS_START = 3;

    public static int countDragonHeads(int age) {
        int quantityHeads = 0;

        if (!(age < 0)) {

            if (age < 200) {
                return quantityHeads = NUMBER_HEADS_START * (1 + age);
            } else if (age < 300) {
                return quantityHeads = NUMBER_HEADS_START + 2 * age + 199;
            } else {
                return quantityHeads = NUMBER_HEADS_START + age + 498;
            }

        } else {
            return quantityHeads = -1;
        }
    }

    public static int countDragonEyes(int age) {
        return countDragonHeads(age) * 2;
    }
}
