/*
 *Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Name of class - Vector;
 * version - 1.0
 */


package by.epam.javatraining.volosevich.maintask01.model.logic;

import org.apache.log4j.Logger;

import java.util.Random;

/**
 * The {@code Vector} class allows to simulate array dynamically expanding array with doubles as stored
 * values. Like an array, it contains components that can be accessed using an integer index. However, the size of array
 * {@code Vector} can grow or shrink as needed to accommodate adding and removing items after the
 * {@code Vector} has been created. The user can manually add elements of {@code Vector} or fill them with
 * random numbers ranging from {@value LEFT_BOUND} to {@value RIGHT_BOUND}. The start size of the {@code Vector} is
 * {@value START_SIZE}. It is possible to increase the size of the {@code Vector} by {@value INCREASING_VALUE}.
 *
 * @author Sergei Volosevich
 * @version 1.0
 * @see Random
 * @see Double
 * @since JDK 5.0
 * <p>
 * Development date: 08.06.2019
 */

public class Vector {

    private static final Logger log = Logger.getLogger(Vector.class);

    /**
     * Left border value for {@link Random#nextDouble()}.
     */
    private static final int LEFT_BOUND = -100;

    /**
     * Right border value for {{@link Random#nextDouble()}.
     */
    private static final int RIGHT_BOUND = 100;

    /**
     * Maximum vector size.
     */
    private static final int MAX_SIZE = 1_000_000_000;

    /**
     * The value by witch the size of the {@code Vector} increases.
     */
    private static final int INCREASING_VALUE = 10;

    /**
     * Start size or the {@code Vector}.
     */
    private static final int START_SIZE = 10;

    /**
     * Objec reference for generating random numbers
     */
    private static final Random RANDOM = new Random();

    /**
     * The array buffer into which the components of the vector are
     * stored. The capacity of the vector is the length of this array buffer,
     * and is at least large enough to contain all the vector's elements.
     */
    private double[] array;

    /**
     * The number of valid components in this {@code Vector} object.
     * Components {@code elementData[0]} through
     * {@code elementData[elementCount-1]} are the actual items.
     */
    private int numOfElem;

    /**
     * Constructs an empty vector with the default capacity
     * capacity increment.
     */
    public Vector() {
        array = new double[START_SIZE];
        numOfElem = 0;
    }

    /**
     * Constructs an empty vector with the specified initial capacity.
     * If {@code capacity} less than zero, constructs with buffer array length.
     *
     * @param capacity the initial capacity of the vector.
     */
    public Vector(int capacity) {
        if (capacity > 0 && capacity < MAX_SIZE) {
            array = new double[capacity];
            numOfElem = 0;
            log.trace("Creating a normal vector.");
        } else {
            array = new double[0];
            numOfElem = 0;
            log.trace("Creating a zero-length vector. Capacity is not correct.");
        }
    }

    /**
     * This method fills the vector with random values.
     */
    public void fillRandomNumbers() {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextDouble() * ((RIGHT_BOUND - LEFT_BOUND) + 1) + LEFT_BOUND;
            numOfElem++;
        }
    }

    /**
     * Method checks empty vector or not.
     *
     * @return {@code true}  - empty vector, {@code false} - otherwise.
     */
    public boolean isEmpty() {
        return numOfElem == 0;
    }

    /**
     * Returns the current capacity of this vector.
     *
     * @return the current capacity (the length of its internal
     * data array, kept in the field {@code array}
     * of this vector)
     */
    public int getSize() {
        return numOfElem;
    }

    /**
     * Return the value of a vector element by it's index.
     *
     * @param index value to which the element corresponds.
     * @return element, that corresponds to the index. If {@code index} is less zero or more than
     * {@link Vector#numOfElem number of elements} method return {@link Double#NaN Not a Number}.
     */
    public double valueOf(int index) {
        log.trace("Entered the method valueOf");
        double result = Double.NaN;
        if (index >= 0 && index < numOfElem) {
            log.trace("Validation successful, return value");
            return result = array[index];
        }
        log.trace("Value check failed");
        return result;
    }

    /**
     * Method adds value to the vector and, if necessary, increases its size.
     *
     * @param value value of the element.
     * @return {@code true} - value inserted in vector, {@code false} - otherwise.
     */
    public boolean add(double value) {
        log.trace("Entered the method add value");
        boolean result = false;
        if (numOfElem == array.length && numOfElem + INCREASING_VALUE <= MAX_SIZE) {
            log.trace("Increase size of vector.");
            double[] b = new double[array.length + INCREASING_VALUE];
            for (int i = 0; i < array.length; i++) {
                log.trace("Adding values.");
                b[i] = array[i];
            }
            array = b;
            array[numOfElem++] = value;
            result = true;
        } else if (numOfElem + INCREASING_VALUE > MAX_SIZE) {
            log.trace("Maximum vector size exceeded.");
            return result;
        } else {
            log.trace("Add value without increasing size of vector.");
            array[numOfElem++] = value;
            result = true;
        }
        log.trace("Return result");
        return result;
    }


    /**
     * String representation of vector values.
     *
     * @return string containing vector values.
     */
    @Override
    public String toString() {
        String array = "Vector = []";
        if (numOfElem != 0) {
            array = "Vector = [";
            for (int i = 0; i < numOfElem - 1; i++) {
                array = array + this.array[i] + ", ";
            }
            array = array + this.array[numOfElem - 1] + "].";
        }
        return array;
    }

    /**
     * Method search max value of the vector.
     *
     * @return max value. If vector {@link Vector#isEmpty() empty}, return - {@link Double#NaN Not a Number}.
     */
    public double searchMaxValue() {
        log.trace("Entered the method searchValue");
        double max = Double.NaN;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test");
            max = array[0];
            for (int i = 1; i < numOfElem; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
        log.trace("Return value max element");
        return max;
    }


    /**
     * Method search min value of the vector.
     *
     * @return min value. If Vector {@link Vector#isEmpty() empty}, return - {@link Double#NaN Not a Number}.
     */
    public double searchMinValue() {
        log.trace("Entered the method searchMinValue");
        double min = Double.NaN;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test");
            min = array[0];
            for (int i = 1; i < numOfElem; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        log.trace("Return value min element");
        return min;
    }


    /**
     * Method calculates the arithmetic average of all vector values.
     *
     * @return value of arithmetic average. If vector {@link Vector#isEmpty() empty},
     * return - {@link Double#NaN Not a Number}.
     */
    public double calcArithmeticAverage() {
        log.trace("Entered the method calcArithmeticAverage");
        double arithmeticAverage = Double.NaN;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test");
            double sum = 0.0;
            for (int i = 0; i < numOfElem; i++) {
                sum += array[i];
            }
            log.trace("Calc Arithmetic average.");
            arithmeticAverage = sum / numOfElem;
        }
        log.trace("Return result.");
        return arithmeticAverage;
    }

    /**
     * Method calculates the geometric average of all vector values.
     *
     * @return value of geometric average. If vector {@link Vector#isEmpty() empty},
     * return - {@link Double#NaN Not a Number}.
     */
    public double calcGeometricAverage() {
        log.trace("Entered the method calcGeometricAverage.");
        double geometricAverage = -1;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test.");
            double mult = 1.0;
            for (int i = 0; i < numOfElem; i++) {
                if (array[i] >= 0) {
                    log.trace("Passed less zero test.");
                    mult *= array[i];
                } else {
                    log.trace("Less zero test failed.");
                    return geometricAverage;
                }
            }
            log.trace("Calc geometric average.");
            geometricAverage = Math.pow(mult, 1.0 / numOfElem);
        }
        log.trace("Return value.");
        return geometricAverage;
    }


    /**
     * The method checks is vector increasing sequence.
     *
     * @return {@code true}  - vector is increasing sequence, {@code false} - otherwise.
     */
    public boolean isIncreasingOrder() {
        log.trace("Entered the method isIncreasingOrder.");
        boolean result = false;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test.");
            for (int i = 1; i < numOfElem; i++) {
                if (array[i] <= array[i - 1]) {
                    log.trace("Check values.");
                    return result;
                }
            }
            log.trace("Return positive result.");
            result = true;
        }
        log.trace("Return negative result.");
        return result;
    }

    /**
     * The method checks is vector decreasing sequence.
     *
     * @return {@code true}  - vector is decreasing sequence, {@code false} - otherwise.
     */
    public boolean isDecreasingOrder() {
        log.trace("Entered the method isDecreasingOrder.");
        boolean result = false;
        if (!isEmpty()) {
            log.trace("Passed a zero-length array test.");
            for (int i = 1; i < numOfElem; i++) {
                if (array[i] >= array[i - 1]) {
                    log.trace("Check values.");
                    return result;
                }
            }
            log.trace("Return positive result.");
            result = true;
        }
        log.trace("Return negative result.");
        return result;
    }

    /**
     * The method searches for the first local maximum among vector elements.
     *
     * @return index of local max. If method not found local max, index is {@code -1}.
     */
    public int indexOfLocalMax() {
        log.trace("Entered the method indexOfLocalMax.");
        int index;
        for (int i = 1; i + 1 < numOfElem; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                log.trace("Find local max.");
                return index = i;
            }
        }
        log.trace("Local max not found.");
        return -1;
    }

    /**
     * The method searches for the first local minimum among vector elements.
     *
     * @return index of local min. If method not found local max, index is {@code -1}.
     */
    public int indexOfLocalMin() {
        log.trace("Entered the method indexOfLocalMin.");
        int index;
        for (int i = 1; i + 1 < numOfElem; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                log.trace("Find local min.");
                return index = i;
            }
        }
        log.trace("Local min not found.");
        return -1;
    }

    /**
     * The method reverses all elements of the vector.
     */
    public void reverseVector() {
        log.trace("Entered the method reverseVector.");
        int lastIndex = numOfElem - 1;
        for (int i = 0; i != numOfElem / 2; i++) {
            swap(array, i, lastIndex - i);
        }
    }

    /**
     * Searches the specified array of doubles for the specified value using the linear search algorithm.
     *
     * @param elementToSearch element, which must be found.
     * @return index of the element found. If method not found element, index is {@code -1}.
     */
    public int linearSearch(double elementToSearch) {
        log.trace("Entered the method linearSearch.");
        int index;
        for (int i = 0; i < numOfElem; i++) {
            if (array[i] == elementToSearch) {
                log.trace("Index found.");
                return index = i;
            }
        }
        log.trace("Value not found.");
        return -1;
    }

    /**
     * Searches the specified array of doubles for the specified value using the
     * binary search algorithm.  The array must be sorted (as
     * by the {@link #quickSort()} method) prior to making this call.  If it
     * is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param elementToSearch element, which must be found.
     * @return index of the element found. If method not found element, index is {@code -1}.
     */
    public int binarySearch(double elementToSearch) {
        log.trace("Entered the method binarySearch");
        int firstIndex = 0;
        int lastIndex = numOfElem - 1;

        while (firstIndex <= lastIndex) {
            log.trace("Calc middle index");
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                log.trace("Value found.");
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                log.trace("Reduce the selection in the right side.");
                firstIndex = middleIndex + 1;
            } else {
                log.trace("Reduce the selection in the left side.");
                lastIndex = middleIndex - 1;
            }
        }
        log.trace("Value not found.");
        return -1;
    }

    /**
     * Sorts the specified array of doubles into ascending numerical order using the merge sort algorithm.
     * This algorithm offers O(n log(n)) performance.
     */
    public void mergeSort() {
        double[] arrayWork = new double[numOfElem];
        recMergeSort(array, arrayWork, 0, numOfElem - 1);
    }

    /**
     * Recursive method to sort vector.
     */
    private static void recMergeSort(double[] array, double[] workSpace, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            recMergeSort(array, workSpace, start, middle);
            recMergeSort(array, workSpace, middle + 1, end);

            merge(array, workSpace, start, middle, end);
        }
    }

    /**
     * Method to merge two unsorted arrays into one sorted array.
     *
     * @param array     buffer in which the components of the vector are stored.
     * @param workSpace additional array for storing intermediate data.
     * @param start     first array index.
     * @param middle    average array index.
     * @param end       last array element.
     */
    private static void merge(double[] array, double[] workSpace, int start, int middle, int end) {
        int i = 0;
        int str = start;
        int midBound = middle + 1;
        int elements = end - start + 1;
        while (start <= middle && midBound <= end) {
            if (array[start] < array[midBound]) {
                workSpace[i++] = array[start++];
            } else {
                workSpace[i++] = array[midBound++];
            }
        }

        while (start <= middle) {
            workSpace[i++] = array[start++];
        }
        while (midBound <= end) {
            workSpace[i++] = array[midBound++];
        }

        for (int j = 0; j < elements; j++) {
            array[str + j] = workSpace[j];
        }
    }

    /**
     * Sorts the specified array of doubles into ascending numerical order using the quick sort algorithm.
     * This algorithm offers O(n log(n)) performance on many data sets, but sometimes degrade to quadratic performance
     * O(n2).
     */
    public void quickSort() {
        recQuickSort(array, 0, numOfElem - 1);
    }

    /**
     * Recursive method to sort vector.
     */
    private static void recQuickSort(double[] array, int start, int end) {
        if (start < end) {
            double pivot = array[end];

            int partition = partition(array, start, end, pivot);

            recQuickSort(array, start, partition - 1); /* recursive method call to sort the left group */
            recQuickSort(array, partition + 1, end); /* recursive method call to sort the right group */
        }
    }

    /**
     * Method divides the vector into two parts relative to the pivot element. Elements of the left part, relative to
     * the reference will be less than the reference, to the right - more
     *
     * @param array buffer in which the components of the vector are stored.
     * @param wall  element for which the elements are being exchanged.
     * @param end
     * @param pivot regarding which the array is sorted two parts.
     * @return index of pivot.
     */
    private static int partition(double[] array, int wall, int end, double pivot) {
        int left = wall;
        while (left != end) {
            if (pivot > array[left]) {
                swap(array, wall, left);
                wall++;
            }
            left++;
        }
        swap(array, wall, end);
        return wall;
    }

    /**
     * Swaps the elements at the specified positions in the specified vector.
     *
     * @param array buffer in which the components of the vector are stored.
     * @param i     index of first element to exchange.
     * @param j     index of second element to exchange.
     */
    private static void swap(double[] array, int i, int j) {
        log.trace("Changing elements.");
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Sorts the specified array of doubles into ascending numerical order using the bubble sort algorithm.
     * This algorithm offers O(n2) performance.
     */
    public void bubbleSort() {
        boolean notSorted = true;
        for (int i = numOfElem - 1; i > 0 && notSorted; i--) {
            notSorted = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    notSorted = true;
                }
            }
        }
    }

    /**
     * Sorts the specified array of doubles into ascending numerical order using the select sort algorithm.
     * This algorithm offers O(n2) performance.
     */
    public void selectSort() {
        for (int i = 0; i < numOfElem - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numOfElem; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            swap(array, i, index);
        }
    }

    /**
     * Sorts the specified array of doubles into ascending numerical order using the insert sort algorithm.
     * This algorithm offers O(n2) performance.
     */
    public void insertSort() {
        for (int i = 1; i < numOfElem; i++) {
            double temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }
}
