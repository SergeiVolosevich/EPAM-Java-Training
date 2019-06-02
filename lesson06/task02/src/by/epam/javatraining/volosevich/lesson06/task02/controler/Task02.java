package by.epam.javatraining.volosevich.lesson06.task02.controler;

import by.epam.javatraining.volosevich.lesson06.task02.model.logic.Number;
import by.epam.javatraining.volosevich.lesson06.task02.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        int number = 123976;

        Printer.print("Number = " + number + " is increasing sequence - "
                + Number.isIncreasingSequence(number));
        Printer.print("Number = " + number + " is decreasing sequence - "
                + Number.isDecreasingSequence(number));
    }
}
