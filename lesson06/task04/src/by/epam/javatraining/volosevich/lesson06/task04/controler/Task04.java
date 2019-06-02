package by.epam.javatraining.volosevich.lesson06.task04.controler;

import by.epam.javatraining.volosevich.lesson06.task04.model.logic.Number;
import by.epam.javatraining.volosevich.lesson06.task04.view.Printer;

public class Task04 {
    public static void main(String[] args) {
        int number = 22461;

        Printer.print(Number.isDigitsEven(number));
        Printer.print(Number.isDigitsOdd(number));
    }
}
