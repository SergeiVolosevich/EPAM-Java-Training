package by.epam.javatraining.volosevich.lesson06.task05.model.logic;

public class NumberLogic {
    private static final int MIN_PRIME = 2;

    public static boolean isPrimeNumber(int number) {
        boolean result = false;
            for (int i = MIN_PRIME; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
                result = true;
            }
        return result;
    }

}
