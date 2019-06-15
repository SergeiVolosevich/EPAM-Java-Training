package by.epam.javatraining.volosevich.lesson06.task04.controler;

import by.epam.javatraining.volosevich.lesson06.task04.model.logic.NumberLogic;
import by.epam.javatraining.volosevich.lesson06.task04.view.Printer;

public class Task04 {
    public static void main(String[] args) {
        int number = 22461;

        Printer.print(NumberLogic.isDigitsEven(number));
        Printer.print(NumberLogic.isDigitsOdd(number));
    }
}
