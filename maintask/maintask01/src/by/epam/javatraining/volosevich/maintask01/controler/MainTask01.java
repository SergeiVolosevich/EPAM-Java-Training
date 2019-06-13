package by.epam.javatraining.volosevich.maintask01.controler;

import by.epam.javatraining.volosevich.maintask01.model.logic.Vector;
import by.epam.javatraining.volosevich.maintask01.view.Printer;

public class MainTask01 {
    public static void main(String[] args) {
        Vector vectorAuto = new Vector(11);

        Printer.print("Size of vector is " + vectorAuto.getSize());

        vectorAuto.fillRandomNumbers();
        Printer.print("Size of vector is " + vectorAuto.getSize());

        vectorAuto.add(34);
        Printer.print("Size of vector is " + vectorAuto.getSize());

        Printer.print(vectorAuto);

        Printer.print("Max value is " + vectorAuto.searchMaxValue());
        Printer.print("Min value is " + vectorAuto.searchMinValue());

        Printer.print("Arithmetic average is " + vectorAuto.calcArithmeticAverage());
        Printer.print("Geometric average is " + vectorAuto.calcGeometricAverage());

        Printer.print("Vector is increasing order - " + vectorAuto.isIncreasingOrder());
        Printer.print("Vector is decreasing order - " + vectorAuto.isDecreasingOrder());

        Printer.print("Index of local Max is " + vectorAuto.indexOfLocalMax());
        Printer.print("Index of local Min is " + vectorAuto.indexOfLocalMin());

        vectorAuto.reverseVector();

        Printer.print("Reverse - " + vectorAuto);

        Printer.print("Index of searching element is " + vectorAuto.linearSearch(20));

        vectorAuto.quickSort();

        Printer.print("Sorted vector is " + vectorAuto);

        Printer.print("Index of searching element is " + vectorAuto.binarySearch(13));

        vectorAuto = new Vector(15);
        vectorAuto.fillRandomNumbers();
        Printer.print(vectorAuto);
        vectorAuto.mergeSort();
        Printer.print("Sorted vector is " + vectorAuto + "\n");

        vectorAuto = new Vector(20);
        vectorAuto.fillRandomNumbers();
        Printer.print(vectorAuto);
        vectorAuto.bubbleSort();
        Printer.print("Sorted vector is " + vectorAuto + "\n");

        vectorAuto = new Vector(16);
        vectorAuto.fillRandomNumbers();
        Printer.print(vectorAuto);
        vectorAuto.insertSort();
        Printer.print("Sorted vector is " + vectorAuto + "\n");

        vectorAuto = new Vector(21);
        vectorAuto.fillRandomNumbers();
        Printer.print(vectorAuto);
        vectorAuto.selectSort();
        Printer.print("Sorted vector is " + vectorAuto + "\n");

        Vector vectorManual = new Vector(10) {
            {
                add(3.5);
                add(7.6);
                add(-4.0);
                add(13);
                add(29);
                add(85);
                add(-5.0);
                add(79);
                add(69);
                add(35);
                add(58);
                add(1);
            }
        };

        Printer.print(vectorManual);

        Printer.print("Max value is " + vectorManual.searchMaxValue());
        Printer.print("Min value is " + vectorManual.searchMinValue());

        Printer.print("Arithmetic average is " + vectorManual.calcArithmeticAverage());
        Printer.print("Geometric average is " + vectorManual.calcGeometricAverage());

        Printer.print("Vector is increasing order - " + vectorManual.isIncreasingOrder());
        Printer.print("Vector is decreasing order - " + vectorManual.isDecreasingOrder());

        Printer.print("Index of local Max is " + vectorManual.indexOfLocalMax());
        Printer.print("Index of local Min is " + vectorManual.indexOfLocalMin());

        vectorManual.reverseVector();

        Printer.print("Reverse - " + vectorManual);

        Printer.print("Index of searching element is " + vectorManual.linearSearch(29));

        vectorManual.quickSort();

        Printer.print("Sorted vector is " + vectorManual);

        Printer.print("Index of searching element is " + vectorManual.binarySearch(85));

        Printer.print("Vector is increasing order - " + vectorManual.isIncreasingOrder());

        int index = 4;
        Printer.print("Value with index " + index + " is " + vectorManual.valueOf(index));
    }
}
