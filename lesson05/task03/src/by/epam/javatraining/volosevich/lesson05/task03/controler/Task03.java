package by.epam.javatraining.volosevich.lesson05.task03.controler;

import by.epam.javatraining.volosevich.lesson05.task03.model.logic.MoodSensor;
import by.epam.javatraining.volosevich.lesson05.task03.view.Printer;

public class Task03 {
    public static void main(String[] args) {
        Printer.print(MoodSensor.determineMood());
    }
}
