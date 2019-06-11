package by.epam.javatraining.volosevich.maintask01.model.logic;

import java.util.Random;

public class Vector {

    private static final int LEFT_BOUND = -100;
    private static final int RIGHT_BOUND = 100;
    private static final int MAX_SIZE = 1_000_000_000;
    private static final int INCREASING_VALUE = 5;
    private static final int START_SIZE = 10;

    private static final Random RANDOM = new Random();
    private double[] a;
    private int numOfElem;


    public Vector() {
        a = new double[START_SIZE];
        numOfElem = 0;
    }

    public Vector(int numberOfElements) {
        if (numberOfElements > 0 && numberOfElements < MAX_SIZE) {
            a = new double[numberOfElements];
            numOfElem = 0;
            for (int i = 0; i < numberOfElements; i++) {
                a[i] = RANDOM.nextInt(RIGHT_BOUND - LEFT_BOUND + 1) + LEFT_BOUND;
                numOfElem++;
            }
        } else {
            a = new double[0];
            numOfElem = 0;
        }
    }

    public boolean isEmpty() {
        return numOfElem == 0;
    }

    public int getSize() {
        return numOfElem;
    }

    public double valueOf(int index) {
        double result = Double.NaN;
        if (index >= 0 && index < numOfElem) {
            return result = a[index];
        }
        return result;
    }

    public boolean add(double value) {
        boolean result = false;
        if (numOfElem == a.length && numOfElem + INCREASING_VALUE <= MAX_SIZE) {
            double[] b = new double[a.length + INCREASING_VALUE];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
            a[numOfElem++] = value;
            result = true;
        } else if (numOfElem + INCREASING_VALUE > MAX_SIZE) {
            return result;
        } else {
            a[numOfElem++] = value;
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        String array = "Vector = []";
        if (numOfElem != 0) {
            array = "Vector = [";
            for (int i = 0; i < numOfElem - 1; i++) {
                array = array + a[i] + ", ";
            }
            array = array + a[numOfElem - 1] + "].";
        }
        return array;
    }

    public double maxValue() {
        double max = Double.NaN;
        if (!isEmpty()) {
            max = a[0];
            for (int i = 1; i < numOfElem; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.NaN;
        if (!isEmpty()) {
            min = a[0];
            for (int i = 1; i < numOfElem; i++) {
                if (min > a[i]) {
                    min = a[i];
                }
            }
        }
        return min;
    }

    public double calcArithmeticAverage() {
        double arithmeticAverage = Double.NaN;
        if (!isEmpty()) {
            double sum = 0.0;
            for (int i = 0; i < numOfElem; i++) {
                sum += a[i];
            }
            arithmeticAverage = sum / numOfElem;
        }
        return arithmeticAverage;
    }

    public double calcGeometricAverage() {
        double geometricAverage = -1;
        if (!isEmpty()) {
            double mult = 1.0;
            for (int i = 0; i < numOfElem; i++) {
                if (a[i] >= 0) {
                    mult *= a[i];
                } else {
                    return geometricAverage;
                }
            }
            geometricAverage = Math.pow(mult, 1.0 / numOfElem);
        }
        return geometricAverage;
    }

    public boolean isIncreasingOrder() {
        boolean result = false;
        if (!isEmpty()) {
            for (int i = 1; i < numOfElem; i++) {
                if (a[i] <= a[i - 1]) {
                    return result;
                }
            }
            result = true;
        }
        return result;
    }

    public boolean isDecreasingOrder() {
        boolean result = false;
        if (!isEmpty()) {
            for (int i = 1; i < numOfElem; i++) {
                if (a[i] >= a[i - 1]) {
                    return result;
                }
            }
            result = true;
        }
        return result;
    }

    public int indexOfLocalMax() {
        int index = -1;
        for (int i = 1; i + 1 < numOfElem; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                return index = i;
            }
        }
        return index;
    }

    public int indexOfLocalMin() {
        int index = -1;
        for (int i = 1; i + 1 < numOfElem; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                return index = i;
            }
        }
        return index;
    }

    public void reverseVector() {
        int lastIndex = numOfElem - 1;
        for (int i = 0; i != numOfElem / 2; i++) {
            swap(a, i, lastIndex - i);
        }
    }

    public int linearSearch(double elementToSearch) {
        int index;
        for (int i = 0; i < numOfElem; i++) {
            if (a[i] == elementToSearch) {
                return index = i;
            }
        }

        return -1;
    }

    public int binarySearch(double elementToSearch) {
        int firstIndex = 0;
        int lastIndex = numOfElem - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (a[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (a[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public void mergeSort() {
        double[] arrayWork = new double[numOfElem];
        recMergeSort(a, arrayWork, 0, numOfElem - 1);
    }

    private static void recMergeSort(double[] array, double[] workSpace, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            recMergeSort(array, workSpace, start, middle);
            recMergeSort(array, workSpace, middle + 1, end);

            merge(array, workSpace, start, middle, end);
        }
    }

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

    public void quickSort() {
        recQuickSort(a, 0, numOfElem - 1);
    }

    private static void recQuickSort(double[] array, int start, int end) {
        if (start < end) {
            double pivot = array[end];

            int partition = partition(array, start, end, pivot);

            recQuickSort(array, start, partition - 1);
            recQuickSort(array, partition + 1, end);
        }
    }

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

    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void bubbleSort() {
        boolean notSorted = true;
        for (int i = numOfElem - 1; i > 0 && notSorted; i--) {
            notSorted = false;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    notSorted = true;
                }
            }
        }
    }

    public void selectSort() {
        for (int i = 0; i < numOfElem - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numOfElem; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            swap(a, i, index);
        }
    }

    public void insertSort() {
        for (int i = 1; i < numOfElem; i++) {
            double temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] >= temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }
}
