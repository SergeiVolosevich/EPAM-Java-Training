package by.epam.javatraining.volosevich.lesson06.task03.model.logic;

public class NumberLogic {
    public static final int NUMBER_MAX_VALUE_FACTORIAL = 170;

    public static double calcFactorial(int number) {
        double fact = 0;
        if (number >= 0 && number <= NUMBER_MAX_VALUE_FACTORIAL) {
            fact = 1E0;
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
        }
        return fact;
    }
}
