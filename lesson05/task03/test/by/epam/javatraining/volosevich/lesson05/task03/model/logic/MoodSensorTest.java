package by.epam.javatraining.volosevich.lesson05.task03.model.logic;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {

    private static final String[] emoji = {":(", ":)", ":|", "(>_<)"};

    @Test
    public void testDetermineMood() {
        String expected = MoodSensor.determineMood();
        boolean bool = false;
        for (String mood : emoji) {
            if (mood.equals(expected)) {
                bool = true;
                break;
            }
        }
        assertTrue(bool);
    }
}