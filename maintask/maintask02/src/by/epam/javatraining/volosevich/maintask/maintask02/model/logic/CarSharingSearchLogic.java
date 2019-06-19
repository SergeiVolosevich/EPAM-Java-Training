package by.epam.javatraining.volosevich.maintask.maintask02.model.logic;

import by.epam.javatraining.volosevich.maintask.maintask02.model.data.Car;
import by.epam.javatraining.volosevich.maintask.maintask02.model.data.CarSharing;
import by.epam.javatraining.volosevich.maintask.maintask02.model.data.ListOfCars;
import by.epam.javatraining.volosevich.maintask.maintask02.model.exception.InvalidParameterException;

public class CarSharingSearchLogic {


    public static Car searchMostExpensiveCar(CarSharing carSharing) throws InvalidParameterException {
        if (carSharing != null) {
            if (!carSharing.getListOfCars().isEmpty()) {
                ListOfCars listOfCars = carSharing.getListOfCars();
                int index = 0;
                for (int i = 1; i < carSharing.getListOfCars().getSize(); i++) {
                    if (listOfCars.get(index).getCost() < listOfCars.get(i).getCost()) {
                        index = i;
                    }
                }
                return listOfCars.get(index);
            }
        }
        throw new InvalidParameterException();
    }

    public static Car searchMostCheapCar(CarSharing carSharing) throws InvalidParameterException {
        if (carSharing != null) {
            if (!carSharing.getListOfCars().isEmpty()) {
                ListOfCars listOfCars = carSharing.getListOfCars();
                int indexMin = 0;
                for (int i = 1; i < carSharing.getListOfCars().getSize(); i++) {
                    if (listOfCars.get(indexMin).getCost() > listOfCars.get(i).getCost()) {
                        indexMin = i;
                    }
                }
                return listOfCars.get(indexMin);
            }
        }
        throw new InvalidParameterException();
    }

    public static Car searchMostPowerfulCar(CarSharing carSharing) throws InvalidParameterException {
        if (carSharing != null) {
            if (!carSharing.getListOfCars().isEmpty()) {
                ListOfCars listOfCars = carSharing.getListOfCars();
                int indexMax = 0;
                for (int i = 1; i < carSharing.getListOfCars().getSize(); i++) {
                    if (listOfCars.get(indexMax).getPower() > listOfCars.get(i).getPower()) {
                        indexMax = i;
                    }
                }
                return listOfCars.get(indexMax);
            }
        }
        throw new InvalidParameterException();
    }
}
