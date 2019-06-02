package by.epam.javatraining.volosevich.lesson06.task03.controler;

import by.epam.javatraining.volosevich.lesson06.task03.model.logic.Number;
import by.epam.javatraining.volosevich.lesson06.task03.view.Printer;

public class Task03 {
    public static void main(String[] args) {
        int number = 170;
        double factorial = Number.calcFactorial(number);

        Printer.print(factorial > 0 ? "!" + number + " = " + factorial : "Incorrect Data");
    }
}
