package by.epam.javatraining.volosevich.maintask.maintask02.model.logic;

import by.epam.javatraining.volosevich.maintask.maintask02.model.data.Car;
import by.epam.javatraining.volosevich.maintask.maintask02.model.data.CarSharing;
import by.epam.javatraining.volosevich.maintask.maintask02.model.data.ClassOfCar;

public class CarSharingLogic {

    public boolean addCar(CarSharing carSharing, Car car) {
        if (carSharing != null) {
            carSharing.getListOfCars().add(car);
            return true;
        }
        return false;
    }


    public static double calcCostOfCars(CarSharing carSharing) {
        return 0.0;
    }

    public static Car[] searchCarsOfSegment(CarSharing carSharing, ClassOfCar classOfCar) {
        return new Car[0];
    }

}



