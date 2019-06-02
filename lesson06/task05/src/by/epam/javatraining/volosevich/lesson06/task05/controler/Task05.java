package by.epam.javatraining.volosevich.lesson06.task05.controler;

import by.epam.javatraining.volosevich.lesson06.task05.model.logic.Number;
import by.epam.javatraining.volosevich.lesson06.task05.view.Printer;

public class Task05 {
    public static void main(String[] args) {
        int number = 199;

        Printer.print("Number = " + number + " is prime - " + Number.isPrimeNumber(number));
    }
}
