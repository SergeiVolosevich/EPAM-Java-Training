package by.epam.javatraining.volosevich.maintask01.view;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger log = Logger.getLogger(Printer.class);

    public static void print(Object message) {
        log.info(message);
    }
}
