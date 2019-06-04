package by.epam.javatraining.volosevich.lesson06.task03.model.logic;

public class Number {
    public static final int NUMBER_MAX_VALUE_FACTORIAL = 170;

    public static double calcFactorial(int number) {
        double fact = 1E0;
        if (number >= 0 && number <= NUMBER_MAX_VALUE_FACTORIAL) {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        } else {
            return 0;
        }
        return fact;
    }
}
