package by.epam.javatraining.volosevich.lesson05.task01.controler;

import by.epam.javatraining.volosevich.lesson05.task01.model.logic.DragonLogic;
import by.epam.javatraining.volosevich.lesson05.task01.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        int ageOfDragon = 2000;

        int numberOfDragonHeads = DragonLogic.countDragonHeads(ageOfDragon);
        int numberOfDragonEyes = DragonLogic.countDragonEyes(ageOfDragon);

        Printer.print("Number of dragon`s heads = " + numberOfDragonHeads);
        Printer.print("Number of dragon`s eyes = " + numberOfDragonEyes);
    }
}
