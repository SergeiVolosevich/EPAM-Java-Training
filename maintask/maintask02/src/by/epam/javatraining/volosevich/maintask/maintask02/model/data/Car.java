package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class Car {

    private String mark;
    private String model;
    private double cost;
    private double power;   /* measurement in kilowatt*/
    private double fuelConsumption;   /* measurement in liters/100km */
    private ClassOfCar segment;

    public Car() {
    }

    public Car(String mark, String model, double cost, double power, double fuelConsumption, ClassOfCar segment) {
        this.mark = mark;
        this.model = model;
        this.cost = cost;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.segment = segment;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public ClassOfCar getSegment() {
        return segment;
    }

    public void setSegment(ClassOfCar segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("mark='").append(mark).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", power=").append(power);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", segment=").append(segment);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getCost(), getCost()) == 0 &&
                Double.compare(car.getPower(), getPower()) == 0 &&
                Double.compare(car.getFuelConsumption(), getFuelConsumption()) == 0 &&
                getMark().equals(car.getMark()) &&
                getModel().equals(car.getModel()) &&
                getSegment() == car.getSegment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getModel(), getCost(), getPower(), getFuelConsumption(), getSegment());
    }
}
