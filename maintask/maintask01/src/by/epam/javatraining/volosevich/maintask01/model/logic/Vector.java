package by.epam.javatraining.volosevich.maintask01.model.logic;

public class Vector {
    public static int indexOfMax(double[] array) {
        int indexMax = -1;
        if (array != null && array.length != 0) {
            indexMax = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[indexMax] < array[i]) {
                    indexMax = i;
                }
            }
        }
        return indexMax;
    }

    public static int indexOfMin(double[] array) {
        int indexMin = -1;
        if (array != null && array.length != 0) {
            indexMin = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[indexMin] > array[i]) {
                    indexMin = i;
                }
            }
        }
        return indexMin;
    }

    public static double calcArithmeticAverage(double[] array) {
        double arithmeticAverage = Double.NaN;
        if (array != null && array.length != 0) {
            double sum = 0.0;
            for (double v : array) {
                sum += v;
            }
            arithmeticAverage = sum / array.length;
        }
        return arithmeticAverage;
    }

    public static double calcGeometricAverage(double[] array) {
        double geometricAverage = -1;
        if (array != null && array.length != 0) {
            double mult = 1.0;
            for (double v : array) {
                if (v > 0) {
                    mult *= v;
                } else {
                    return geometricAverage;
                }
            }
            geometricAverage = Math.pow(mult, 1.0 / array.length);
        }
        return geometricAverage;
    }

    public static boolean isIncreasingOrder(double[] array) {
        boolean result = false;
        if (array != null && array.length != 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    return result;
                }
            }
            result = true;
        }
        return result;
    }

    public static boolean isDecreasingOrder(double[] array) {
        boolean result = false;
        if (array != null && array.length != 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    return result;
                }
            }
            result = true;
        }
        return result;
    }

    public static int indexOfLocalMax(double[] array) {
        int index = -1;
        if (array != null && array.length != 0) {
            for (int i = 1; i + 1 < array.length; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    return index = i;
                }
            }
        }
        return index;
    }

    public static int indexOfLocalMin(double[] array) {
        int index = -1;
        if (array != null && array.length != 0) {
            for (int i = 1; i + 1 < array.length; i++) {
                if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                    return index = i;
                }
            }
        }
        return index;
    }

    public static void reverseVector(double[] array) {
        if (array != null && array.length != 0) {
            int lastIndex = array.length - 1;
            double temp;
            for (int i = 0; i != array.length / 2; i++) {
                temp = array[i];
                array[i] = array[lastIndex - i];
                array[lastIndex - i] = temp;
            }
        }
    }

    public static int linearSearch(double[] array, double elementToSearch) {
        int index = -1;
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == elementToSearch) {
                    return index = i;
                }
            }
        }
        return index;
    }

    public static int binarySearch(double[] array, double elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
