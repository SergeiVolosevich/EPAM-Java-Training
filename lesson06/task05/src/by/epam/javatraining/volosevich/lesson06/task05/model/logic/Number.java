package by.epam.javatraining.volosevich.lesson06.task05.model.logic;

public class Number {
    private static final int MIN_PRIME = 2;

    public static boolean isPrimeNumber(int number) {
        if (number > 0 && number != 1) {
            for (int i = MIN_PRIME; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
