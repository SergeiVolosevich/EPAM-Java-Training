package by.epam.javatraining.volosevich.lesson06.task02.controler;

import by.epam.javatraining.volosevich.lesson06.task02.model.logic.NumberLogic;
import by.epam.javatraining.volosevich.lesson06.task02.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        int number = 1234567;

        Printer.print("NumberLogic = " + number + " is increasing sequence - "
                + NumberLogic.isIncreasingSequence(number));
        Printer.print("NumberLogic = " + number + " is decreasing sequence - "
                + NumberLogic.isDecreasingSequence(number));
    }
}
