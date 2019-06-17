package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import static by.epam.javatraining.volosevich.maintask.maintask02.model.data.ClassOfCar.E;

public class ExecutiveCar extends Car {
    private static final double MAX_LENGTH = 1;
    private static final double MIN_LENGTH = 1;
    private static final double MAX_WIDTH = 1;
    private static final double MIN_WIDTH = 1;

    private ClassOfCar segment = E;

    @Override
    public String toString() {
        return "ExecutiveCar{" +
                "segment=" + segment +
                "} " + super.toString();
    }
}
