package by.epam.javatraining.volosevich.lesson06.task03.model.logic;

public class NumberLogic {
    public static final int NUMBER_MAX_VALUE_FACTORIAL = 170;

    public static double calcFactorial(int number) {
        if (number < 0) {
            return 0;
        }
        double fact = 1E0;
        for (int i = 2; i <= number && number <= NUMBER_MAX_VALUE_FACTORIAL; i++) {
            fact *= i;
        }
        return fact;
    }
}
