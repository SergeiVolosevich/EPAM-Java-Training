package by.epam.javatraining.volosevich.lesson06.task04.model.logic;

public class NumberLogic {
    private static final int NUMBER_OF_TENS = 10;
    private static final int EVEN_NUMBER_DIVIDER = 2;

    public static boolean isDigitsEven(int number) {
        boolean result = false;
        int digit;
        while (number > 0) {
            digit = number % NUMBER_OF_TENS;
            if (digit % EVEN_NUMBER_DIVIDER != 0) {
                return false;
            }
            number /= NUMBER_OF_TENS;
            result = true;
        }
        return result;
    }

    public static boolean isDigitsOdd(int number) {
        boolean result = false;
        int digit;
        while (number > 0) {
            digit = number % NUMBER_OF_TENS;
            if (digit % EVEN_NUMBER_DIVIDER == 0) {
                return false;
            }
            number /= NUMBER_OF_TENS;
            result = true;
        }
        return result;
    }
}
