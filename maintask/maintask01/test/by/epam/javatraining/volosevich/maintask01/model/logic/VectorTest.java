package by.epam.javatraining.volosevich.maintask01.model.logic;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class VectorTest {

    private Vector vector;
    private Vector zeroVector;
    private Vector manualVector;
    private double[] arrayToSort;
    private double[] sortedArrayByClassVector;
    private double[] sortedArrayByClassArrays;

    @Before
    public void setUp() throws Exception {
        vector = new Vector(100);
        vector.fillRandomNumbers();
        zeroVector = new Vector(0);
        manualVector = new Vector();

        arrayToSort = new double[vector.getSize()];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = vector.valueOf(i);
        }

        sortedArrayByClassVector = new double[vector.getSize()];
        sortedArrayByClassArrays = new double[vector.getSize()];
    }

    @Test
    public void testIsEmpty() {
        assertFalse(vector.isEmpty());
    }

    @Test
    public void testValueOfByNegativeValue() {
        double expected = Double.NaN;
        assertEquals(expected, vector.valueOf(-1), 0);
    }

    @Test
    public void testValueOfByValidValue() {
        double expected = arrayToSort[1];
        assertEquals(expected, vector.valueOf(1), 0);
    }

    @Test
    public void testValueOfByInvalidValue() {
        double expected = Double.NaN;
        assertEquals(expected, vector.valueOf(100), 0);
    }

    @Test
    public void testSearchMaxValue() {
        double expected = vector.searchMaxValue();
        Arrays.sort(arrayToSort);

        assertEquals(expected, arrayToSort[arrayToSort.length - 1], 0);
    }

    @Test
    public void testSearchMaxValueByZeroVector() {
        double result = Double.NaN;
        double expected = zeroVector.searchMaxValue();

        assertEquals(expected, result, 0);
    }

    @Test
    public void testSearchMinValue() {
        double expected = vector.searchMinValue();
        Arrays.sort(arrayToSort);

        assertEquals(expected, arrayToSort[0], 0);
    }

    @Test
    public void testSearchMinValueByZeroVector() {
        double expected = zeroVector.searchMinValue();
        double result = Double.NaN;

        assertEquals(expected, result, 0);
    }

    @Test
    public void testCalcArithmeticAverage() {
        manualVector.add(1);
        manualVector.add(12);
        manualVector.add(3);
        manualVector.add(8);
        manualVector.add(9);
        manualVector.add(9);

        double expected = 7.0;

        assertEquals(expected, manualVector.calcArithmeticAverage(), 0);
    }

    @Test
    public void testCalcArithmeticAverageByZeroVector() {
        double expected = Double.NaN;

        assertEquals(expected, zeroVector.calcArithmeticAverage(), 0);
    }

    @Test
    public void testCalcGeometricAverage() {
        manualVector.add(1);
        manualVector.add(12);
        manualVector.add(3);
        manualVector.add(8);
        manualVector.add(9);
        manualVector.add(9);

        double expected = 5.345392;

        assertEquals(expected, manualVector.calcGeometricAverage(), 0.001);
    }

    @Test
    public void testCalcGeometricAverageByZeroVector() {
        double expected = -1;

        assertEquals(expected, zeroVector.calcGeometricAverage(), 0.001);
    }

    @Test
    public void testIsIncreasingOrderTrue() {
        manualVector.add(1);
        manualVector.add(2);
        manualVector.add(3);
        manualVector.add(4);
        manualVector.add(5);
        manualVector.add(6);
        manualVector.add(7);

        assertTrue(manualVector.isIncreasingOrder());
    }

    @Test
    public void testIsIncreasingOrderFalse() {
        manualVector.add(1);
        manualVector.add(7);
        manualVector.add(3);
        manualVector.add(4);
        manualVector.add(5);
        manualVector.add(6);
        manualVector.add(7);

        assertFalse(manualVector.isIncreasingOrder());
    }

    @Test
    public void testIsIncreasingOrderByDuplicateValue() {
        manualVector.add(1);
        manualVector.add(2);
        manualVector.add(3);
        manualVector.add(4);
        manualVector.add(5);
        manualVector.add(5);
        manualVector.add(7);

        assertFalse(manualVector.isIncreasingOrder());
    }

    @Test
    public void testIsIncreasingOrderByZeroVector() {

        assertFalse(zeroVector.isIncreasingOrder());
    }

    @Test
    public void testIsDecreasingOrderTrue() {
        manualVector.add(7);
        manualVector.add(6);
        manualVector.add(5);
        manualVector.add(4);
        manualVector.add(3);
        manualVector.add(2);
        manualVector.add(1);
        manualVector.add(0);

        assertTrue(manualVector.isDecreasingOrder());
    }

    @Test
    public void testIsDecreasingOrderFalse() {
        manualVector.add(7);
        manualVector.add(6);
        manualVector.add(5);
        manualVector.add(12);
        manualVector.add(3);
        manualVector.add(2);
        manualVector.add(1);
        manualVector.add(0);

        assertFalse(manualVector.isDecreasingOrder());
    }

    @Test
    public void testIsDecreasingOrderByDuplicateValue() {
        manualVector.add(7);
        manualVector.add(6);
        manualVector.add(5);
        manualVector.add(4);
        manualVector.add(3);
        manualVector.add(2);
        manualVector.add(2);
        manualVector.add(2);

        assertFalse(manualVector.isDecreasingOrder());
    }

    @Test
    public void testIsDecreasingOrderByZeroVector() {

        assertFalse(zeroVector.isDecreasingOrder());
    }

    @Test
    public void testIndexOfLocalMaxValidValue() {
        manualVector.add(1);
        manualVector.add(16);
        manualVector.add(3);
        manualVector.add(15);
        manualVector.add(1);
        manualVector.add(-7);
        manualVector.add(15);

        int expected = 1;

        assertEquals(expected, manualVector.indexOfLocalMax());
    }

    @Test
    public void testIndexOfLocalMaxInvalidValue() {
        manualVector.add(1);
        manualVector.add(16);
        manualVector.add(16);
        manualVector.add(16);
        manualVector.add(16);
        manualVector.add(16);
        manualVector.add(16);

        int expected = -1;

        assertEquals(expected, manualVector.indexOfLocalMax());
    }

    @Test
    public void testIndexOfLocalMaxByZeroVector() {
        int expected = -1;

        assertEquals(expected, zeroVector.indexOfLocalMax());
    }

    @Test
    public void testIndexOfLocalMinValidValue() {
        manualVector.add(1);
        manualVector.add(-116);
        manualVector.add(3);
        manualVector.add(15);
        manualVector.add(1);
        manualVector.add(-7);
        manualVector.add(15);

        int expected = 1;

        assertEquals(expected, manualVector.indexOfLocalMin());
    }

    @Test
    public void testIndexOfLocalMinInvalidValue() {
        manualVector.add(1);
        manualVector.add(-116);
        manualVector.add(-116);
        manualVector.add(-116);
        manualVector.add(1);
        manualVector.add(-7);
        manualVector.add(-15);

        int expected = -1;

        assertEquals(expected, manualVector.indexOfLocalMin());
    }

    @Test
    public void testIndexOfLocalMinByZeroVector() {
        int expected = -1;

        assertEquals(expected, zeroVector.indexOfLocalMin());
    }

    @Test
    public void testReverseVector() {
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }
        vector.reverseVector();

        boolean expected = true;
        int lastIndex = sortedArrayByClassVector.length - 1;
        for (int i = 0; i < vector.getSize(); i++) {
            if (vector.valueOf(i) != sortedArrayByClassVector[lastIndex - i]) {
                expected = false;
            }
        }

        assertTrue(expected);
    }

    @Test
    public void testLinearSearch() {
        manualVector.add(15);
        manualVector.add(123);
        manualVector.add(17);
        manualVector.add(123);
        manualVector.add(143);
        manualVector.add(298);

        int result = manualVector.linearSearch(123);
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    public void testLinearSearchByZeroVector() {
        int expected = -1;

        assertEquals(expected, zeroVector.linearSearch(12));
    }

    @Test
    public void testBinarySearch() {
        manualVector.add(15);
        manualVector.add(123);
        manualVector.add(17);
        manualVector.add(123);
        manualVector.add(143);
        manualVector.add(298);

        manualVector.quickSort();

        int result = manualVector.binarySearch(298);
        int expected = 5;

        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchByZeroVector() {
        int expected = -1;

        assertEquals(expected, zeroVector.binarySearch(1));
    }

    @Test
    public void mergeSort() {
        vector.mergeSort();
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }

        Arrays.sort(arrayToSort);
        for (int i = 0; i < sortedArrayByClassArrays.length; i++) {
            sortedArrayByClassArrays[i] = arrayToSort[i];
        }
        assertArrayEquals(sortedArrayByClassVector, sortedArrayByClassArrays, 0);
    }

    @Test
    public void testQuickSort() {
        vector.quickSort();
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }

        Arrays.sort(arrayToSort);
        for (int i = 0; i < sortedArrayByClassArrays.length; i++) {
            sortedArrayByClassArrays[i] = arrayToSort[i];
        }
        assertArrayEquals(sortedArrayByClassVector, sortedArrayByClassArrays, 0);
    }

    @Test
    public void testBubbleSort() {
        vector.bubbleSort();
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }

        Arrays.sort(arrayToSort);
        for (int i = 0; i < sortedArrayByClassArrays.length; i++) {
            sortedArrayByClassArrays[i] = arrayToSort[i];
        }
        assertArrayEquals(sortedArrayByClassVector, sortedArrayByClassArrays, 0);
    }

    @Test
    public void testSelectSort() {
        vector.selectSort();
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }

        Arrays.sort(arrayToSort);
        for (int i = 0; i < sortedArrayByClassArrays.length; i++) {
            sortedArrayByClassArrays[i] = arrayToSort[i];
        }
        assertArrayEquals(sortedArrayByClassVector, sortedArrayByClassArrays, 0);
    }

    @Test
    public void testInsertSort() {
        vector.insertSort();
        for (int i = 0; i < sortedArrayByClassVector.length; i++) {
            sortedArrayByClassVector[i] = vector.valueOf(i);
        }

        Arrays.sort(arrayToSort);
        for (int i = 0; i < sortedArrayByClassArrays.length; i++) {
            sortedArrayByClassArrays[i] = arrayToSort[i];
        }
        assertArrayEquals(sortedArrayByClassVector, sortedArrayByClassArrays, 0);
    }
}