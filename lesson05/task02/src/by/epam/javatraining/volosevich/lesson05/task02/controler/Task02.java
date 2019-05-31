package by.epam.javatraining.volosevich.lesson05.task02.controler;

import by.epam.javatraining.volosevich.lesson05.task02.model.logic.Alphabet;
import by.epam.javatraining.volosevich.lesson05.task02.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        char symbol1 = 'A';
        char symbol2 = '2';

        String trueMessage = "\'" + symbol1 + "\'" + " symbol is a vowel.\n";
        String falseMessage = "\'" + symbol2 + "\'" + " symbol is not vowel.\n";

        Printer.printDependOnCondition(Alphabet.isVowelFirstVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(Alphabet.isVowelFirstVersion(symbol2), trueMessage, falseMessage);

        Printer.printDependOnCondition(Alphabet.isVowelSecondVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(Alphabet.isVowelSecondVersion(symbol2), trueMessage, falseMessage);

        Printer.printDependOnCondition(Alphabet.isVowelThirdVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(Alphabet.isVowelThirdVersion(symbol2), trueMessage, falseMessage);
    }
}
