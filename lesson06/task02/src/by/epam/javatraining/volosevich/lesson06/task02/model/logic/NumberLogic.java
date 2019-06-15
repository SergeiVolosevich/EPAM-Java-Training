package by.epam.javatraining.volosevich.lesson06.task02.model.logic;

public class NumberLogic {
    private static final int NUMBER_OF_TENS = 10;
    private static final int MAX_VALUE_NOT_SEQUENCE = 9;

    public static boolean isIncreasingSequence(int number) {
        boolean bool = false;
        number = number > 0 ? number : -number;
        while (number > MAX_VALUE_NOT_SEQUENCE) {
            int digit = number % NUMBER_OF_TENS;
            number /= NUMBER_OF_TENS;
            if (digit < (number % NUMBER_OF_TENS)) {
                return false;
            }
            bool = true;
        }
        return bool;
    }

    public static boolean isDecreasingSequence(int number) {
        boolean bool = false;
        number = number > 0 ? number : -number;
        while (number > MAX_VALUE_NOT_SEQUENCE) {
            int digit = number % NUMBER_OF_TENS;
            number /= NUMBER_OF_TENS;
            if (digit > (number % NUMBER_OF_TENS)) {
                return false;
            }
            bool = true;
        }
        return bool;
    }
}
