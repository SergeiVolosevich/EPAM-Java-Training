package by.epam.javatraining.volosevich.lesson05.task02.model.logic;

public class Alphabet {

    private static final char A_UPPER_CASE = 'A';
    private static final char E_UPPER_CASE = 'E';
    private static final char I_UPPER_CASE = 'I';
    private static final char O_UPPER_CASE = 'O';
    private static final char U_UPPER_CASE = 'U';
    private static final char A_LOWER_CASE = 'a';
    private static final char E_LOWER_CASE = 'e';
    private static final char I_LOWER_CASE = 'i';
    private static final char O_LOWER_CASE = 'o';
    private static final char U_LOWER_CASE = 'u';

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static boolean isVowelFirstVersion(char symbol) {
        if (symbol == A_UPPER_CASE || symbol == E_UPPER_CASE || symbol == I_UPPER_CASE ||
                symbol == O_UPPER_CASE || symbol == U_UPPER_CASE) {
            return true;
        } else if (symbol == A_LOWER_CASE || symbol == E_LOWER_CASE || symbol == I_LOWER_CASE ||
                symbol == O_LOWER_CASE || symbol == U_LOWER_CASE) {
            return true;
        }
        return false;
    }

    public static boolean isVowelSecondVersion(char symbol) {
        char symbolLowerCase = Character.toLowerCase(symbol);
        for (char vowel : VOWELS) {
            if (symbolLowerCase == vowel) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelThirdVersion(char symbol) {
        switch (symbol) {
            case A_UPPER_CASE:
                return true;
            case A_LOWER_CASE:
                return true;
            case E_UPPER_CASE:
                return true;
            case E_LOWER_CASE:
                return true;
            case I_UPPER_CASE:
                return true;
            case I_LOWER_CASE:
                return true;
            case O_UPPER_CASE:
                return true;
            case O_LOWER_CASE:
                return true;
            case U_UPPER_CASE:
                return true;
            case U_LOWER_CASE:
                return true;
        }
        return false;
    }
}
