package by.epam.javatraining.volosevich.lesson05.task02.controler;

import by.epam.javatraining.volosevich.lesson05.task02.model.logic.AlphabetLogic;
import by.epam.javatraining.volosevich.lesson05.task02.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        char symbol1 = 'E';
        char symbol2 = '2';

        String trueMessage = "\'" + symbol1 + "\'" + " symbol is a vowel.\n";
        String falseMessage = "\'" + symbol2 + "\'" + " symbol is not vowel.\n";

        Printer.printDependOnCondition(AlphabetLogic.isVowelFirstVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(AlphabetLogic.isVowelFirstVersion(symbol2), trueMessage, falseMessage);

        Printer.printDependOnCondition(AlphabetLogic.isVowelSecondVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(AlphabetLogic.isVowelSecondVersion(symbol2), trueMessage, falseMessage);

        Printer.printDependOnCondition(AlphabetLogic.isVowelThirdVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(AlphabetLogic.isVowelThirdVersion(symbol2), trueMessage, falseMessage);

        Printer.printDependOnCondition(AlphabetLogic.isVowelFoursVersion(symbol1), trueMessage, falseMessage);
        Printer.printDependOnCondition(AlphabetLogic.isVowelFoursVersion(symbol2), trueMessage, falseMessage);
    }
}
