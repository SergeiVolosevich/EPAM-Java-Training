package by.epam.javatraining.volosevich.lesson05.task02.model.logic;

public class Alphabet {

    private static final char A_LOWER_CASE = 'a';
    private static final char E_LOWER_CASE = 'e';
    private static final char I_LOWER_CASE = 'i';
    private static final char O_LOWER_CASE = 'o';
    private static final char U_LOWER_CASE = 'u';

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static boolean isVowelFirstVersion(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return symbol == A_LOWER_CASE || symbol == E_LOWER_CASE || symbol == I_LOWER_CASE ||
                symbol == O_LOWER_CASE || symbol == U_LOWER_CASE;
    }

    public static boolean isVowelSecondVersion(char symbol) {
        symbol = Character.toLowerCase(symbol);
        for (char vowel : VOWELS) {
            if (symbol == vowel) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelThirdVersion(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case A_LOWER_CASE:
            case E_LOWER_CASE:
            case I_LOWER_CASE:
            case O_LOWER_CASE:
            case U_LOWER_CASE:
                return true;
        }
        return false;
    }

    public static boolean isVowelFoursVersion(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return "aeiou".indexOf(symbol) != -1;
    }
}
