package by.epam.javatraining.volosevich.lesson05.task01.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonLogicTest {

    @Test
    public void testCountDragonHeadsAgeZero() {
        int age = 0;
        int expected = 3;

        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsInvalidData() {
        int age = -15;
        int expected = 0;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeFirstPeriod() {
        int age = 200;
        int expected = 603;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeSecondPeriod() {
        int age = 250;
        int expected = 703;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeThirdPeriod() {
        int age = 350;
        int expected = 853;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test(timeout = 100)
    public void countDragonHeadsTimeout() {
        int age = 3000;

        DragonLogic.countDragonHeads(age);
    }

    @Test
    public void testCountDragonEyesAgeZero() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesInvalidData() {
        int age = -1;
        int expected = 0;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeFirstPeriod() {
        int age = 200;
        int expected = 1206;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeSecondPeriod() {
        int age = 250;
        int expected = 1406;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeThirdPeriod() {
        int age = 350;
        int expected = 1706;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test(timeout = 100)
    public void testCountDragonEyesTimeout() {
        int age = 0;

        DragonLogic.countDragonEyes(age);
    }
}