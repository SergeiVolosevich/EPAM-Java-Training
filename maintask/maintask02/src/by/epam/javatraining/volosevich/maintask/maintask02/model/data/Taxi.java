package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Arrays;
import java.util.Objects;

public class Taxi {
    private String nameCompany;
    private Car[] cars;
    private int numberOfCars;

    public Taxi() {
    }

    public Taxi(String nameCompany, Car[] cars, int numberOfCars) {
        this.nameCompany = nameCompany;
        this.cars = cars;
        this.numberOfCars = numberOfCars;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Taxi{");
        sb.append("nameCompany='").append(nameCompany).append('\'');
        sb.append(", cars=").append(Arrays.toString(cars));
        sb.append(", numberOfCars=").append(numberOfCars);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taxi)) return false;
        Taxi taxi = (Taxi) o;
        return getNumberOfCars() == taxi.getNumberOfCars() &&
                getNameCompany().equals(taxi.getNameCompany()) &&
                Arrays.equals(getCars(), taxi.getCars());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameCompany(), getNumberOfCars());
        result = 31 * result + Arrays.hashCode(getCars());
        return result;
    }
}
