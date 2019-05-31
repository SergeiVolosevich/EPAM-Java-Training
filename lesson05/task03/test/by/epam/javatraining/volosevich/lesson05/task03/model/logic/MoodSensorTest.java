package by.epam.javatraining.volosevich.lesson05.task03.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test(timeout = 200)
    public void testDetermineMoodTimeout() {
        MoodSensor.determineMood(-2_000_000_000);
    }

    @Test
    public void testDetermineMoodGladness() {
        int randomNumber = 1_000_000;
        String expected = "\\(^_^)/";

        assertEquals(expected, MoodSensor.determineMood(randomNumber));
    }

    @Test
    public void testDetermineMoodIndifference() {
        int randomNumber = 500_000;
        String expected = ":|";

        assertEquals(expected, MoodSensor.determineMood(randomNumber));
    }

    @Test
    public void testDetermineMoodIrritable() {
        int randomNumber = -400_000;
        String expected = "(>_<)";

        assertEquals(expected, MoodSensor.determineMood(randomNumber));
    }

    @Test
    public void testDetermineMoodDisappointed() {
        int randomNumber = -600_000;
        String expected = "(-_-)";

        assertEquals(expected, MoodSensor.determineMood(randomNumber));
    }
}