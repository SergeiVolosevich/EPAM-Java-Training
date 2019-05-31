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
        int expected = -1;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeLessTwoHundred() {
        int age = 199;
        int expected = 600;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeEqualsTwoHundred() {
        int age = 200;
        int expected = 602;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeLessThreeHundred() {
        int age = 299;
        int expected = 800;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeEqualsThreeHundred() {
        int age = 300;
        int expected = 801;
        assertEquals(expected, DragonLogic.countDragonHeads(age));
    }

    @Test
    public void testCountDragonHeadsAgeMoreThreeHundred() {
        int age = 500;
        int expected = 1001;
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
        int expected = -2;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeLessTwoHundred() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeEqualsTwoHundred() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeLessThreeHundred() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeEqualsThreeHundred() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test
    public void testCountDragonEyesAgeMoreThreeHundred() {
        int age = 0;
        int expected = 6;

        assertEquals(expected, DragonLogic.countDragonEyes(age));
    }

    @Test(timeout = 100)
    public void testCountDragonEyesTimeout() {
        int age = 0;

        DragonLogic.countDragonEyes(age);
    }
}