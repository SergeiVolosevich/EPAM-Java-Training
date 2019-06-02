package by.epam.javatraining.volosevich.lesson06.task04.model.logic;

public class Number {
    private static final int NUMBER_OF_TENS = 10;
    private static final int EVEN_NUMBER_DIVIDER = 2;

    public static boolean isDigitsEven(int number) {
        boolean bool = false;
        if (number >= 0) {
            while (number > 0) {
                int digit = number % NUMBER_OF_TENS;
                if (digit % EVEN_NUMBER_DIVIDER == 0) {
                    bool = true;
                } else {
                    return false;
                }
                number /= NUMBER_OF_TENS;
            }
        }
        return bool;
    }

    public static boolean isDigitsOdd(int number) {
        boolean bool = false;
        if (number >= 0) {
            while (number > 0) {
                int digit = number % NUMBER_OF_TENS;
                if (digit % EVEN_NUMBER_DIVIDER != 0) {
                    bool = true;
                } else {
                    return false;
                }
                number /= NUMBER_OF_TENS;
            }
        }
        return bool;
    }
}
