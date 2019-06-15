package by.epam.javatraining.volosevich.lesson05.task03.model.logic;

import java.util.Random;

public class MoodSensor {
    private static final Random RANDOM = new Random();
    public static final int MOOD_COUNT = 4;

    private static final String SAD_MOOD = ":(";
    private static final String GOOD_MOOD = ":)";
    private static final String NEUTRAL_MOOD = ":|";
    private static final String EVIL_MOOD = "(>_<)";


    public static String determineMood() {
        String emoji = SAD_MOOD;
        switch (RANDOM.nextInt(MOOD_COUNT)){
            case 3: emoji = GOOD_MOOD; break;
            case 2: emoji = NEUTRAL_MOOD; break;
            case 1: emoji = EVIL_MOOD; break;
        }
        return emoji;
    }
}
