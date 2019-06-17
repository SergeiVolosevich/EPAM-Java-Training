package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

public class Taxi{
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

    public Car[] getCars() {
        return cars;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
}
