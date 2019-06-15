package by.epam.javatraining.volosevich.lesson06.task05.controler;

import by.epam.javatraining.volosevich.lesson06.task05.model.logic.NumberLogic;
import by.epam.javatraining.volosevich.lesson06.task05.view.Printer;

public class Task05 {
    public static void main(String[] args) {
        int number = 11;

        Printer.print("NumberLogic = " + number + " is prime - " + NumberLogic.isPrimeNumber(number));
    }
}
