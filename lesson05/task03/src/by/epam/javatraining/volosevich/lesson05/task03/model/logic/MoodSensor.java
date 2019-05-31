package by.epam.javatraining.volosevich.lesson05.task03.model.logic;

public class MoodSensor {

    public static String determineMood(int randomNumber) {
        String emoji = "(-_-)";

        if (randomNumber >= 1_000_000) {
            return emoji = "\\(^_^)/";
        } else if (randomNumber >= 500_000) {
            return emoji = ":|";
        } else if (randomNumber >= -500_000) {
            return emoji = "(>_<)";
        }
        return emoji;
    }
}
