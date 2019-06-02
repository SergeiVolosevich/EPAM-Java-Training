package by.epam.javatraining.volosevich.lesson06.task01.controler;

import by.epam.javatraining.volosevich.lesson06.task01.model.logic.Coin;
import by.epam.javatraining.volosevich.lesson06.task01.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        int numberOfFlips = 1000;

        Coin coin = new Coin();
        coin.countHeadsAndTails(1000);

        Printer.print("Number of tails = " + coin.getData().getQuantityTails()
                + ", " + "Number of Heads = " + coin.getData().getQuantityHeads());
    }
}
