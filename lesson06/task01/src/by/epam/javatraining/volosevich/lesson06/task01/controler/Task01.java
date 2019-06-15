package by.epam.javatraining.volosevich.lesson06.task01.controler;

import by.epam.javatraining.volosevich.lesson06.task01.model.logic.CoinLogic;
import by.epam.javatraining.volosevich.lesson06.task01.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        int numberOfFlips = 100;
        int quantityHeads = CoinLogic.countHeads(numberOfFlips);
        int quantityTails = -1;
        if (quantityHeads >= 0) {
            quantityTails = numberOfFlips - quantityHeads;
        }
        Printer.print("Quantity heads = " + quantityHeads);
        Printer.print("Quantity tails = " + quantityTails);
    }
}
