package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import static by.epam.javatraining.volosevich.maintask.maintask02.model.data.ClassOfCar.*;

public class MiniCar extends Car {
    private static final double MAX_LENGTH = 1;
    private static final double MIN_LENGTH = 1;
    private static final double MAX_WIDTH = 1;
    private static final double MIN_WIDTH = 1;

    private ClassOfCar segment = A;

    public MiniCar() {
    }

    public MiniCar(String mark, String model, String color, double cost, double power, double fuelConsumption,
                   double fuelCapacity, double engineCapacity, int numberOfSeats) {
        super(mark, model, color, cost, power, fuelConsumption, fuelCapacity, engineCapacity, numberOfSeats);
    }

    public ClassOfCar getSegment() {
        return segment;
    }
}
