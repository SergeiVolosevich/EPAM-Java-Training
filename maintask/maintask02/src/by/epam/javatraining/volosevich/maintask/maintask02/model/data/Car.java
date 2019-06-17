package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public abstract class Car {
    private String mark;
    private String model;
    private String color;
    private double cost;
    private double power;    /* measurement in kilowatt*/
    private double fuelConsumption;   /* measurement in liters/100km */
    private double fuelCapacity;   /* measurement in liters*/
    private double engineCapacity; /* measurement in liters*/
    private int numberOfSeats;

    public Car() {
    }

    public Car(String mark, String model, String color, double cost, double power, double fuelConsumption,
               double fuelCapacity, double engineCapacity, int numberOfSeats) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.cost = cost;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
        this.engineCapacity = engineCapacity;
        this.numberOfSeats = numberOfSeats;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public double getPower() {
        return power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Car{").append("mark='").append(mark).append('\'').append(", model='")
                .append(model).append('\'').append(", color='").append(color).append('\'').append(", cost=")
                .append(cost).append(", power=").append(power).append(", fuelConsumption=").append(fuelConsumption)
                .append(", fuelCapacity=").append(fuelCapacity).append(", engineCapacity=").append(engineCapacity)
                .append(", numberOfSeats=").append(numberOfSeats).append('}').toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getCost(), getCost()) == 0 &&
                Double.compare(car.getPower(), getPower()) == 0 &&
                Double.compare(car.getFuelConsumption(), getFuelConsumption()) == 0 &&
                Double.compare(car.getFuelCapacity(), getFuelCapacity()) == 0 &&
                Double.compare(car.getEngineCapacity(), getEngineCapacity()) == 0 &&
                getNumberOfSeats() == car.getNumberOfSeats() &&
                getMark().equals(car.getMark()) &&
                getModel().equals(car.getModel()) &&
                getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getModel(), getColor(), getCost(), getPower(), getFuelConsumption(),
                getFuelCapacity(), getEngineCapacity(), getNumberOfSeats());
    }
}
