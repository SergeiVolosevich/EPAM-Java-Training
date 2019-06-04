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
        int numberOfMood = RANDOM.nextInt(MOOD_COUNT);
        String emoji = SAD_MOOD;

        if (numberOfMood == 3) {
            emoji = GOOD_MOOD;
        } else if (numberOfMood == 2) {
            emoji = NEUTRAL_MOOD;
        } else if (numberOfMood == 1) {
            emoji = EVIL_MOOD;
        }
        return emoji;
    }
}
