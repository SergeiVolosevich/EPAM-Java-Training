package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class SportCar extends Car {

    private boolean roof;
    private double acceleration; /* accelerate to 100 km/h from a dead stop*/
    private int maxSpeed;  /* measurement in km/h */

    public SportCar() {
    }

    public SportCar(String mark, String model, double cost, double power, double fuelConsumption, ClassOfCar segment,
                    boolean roof, double acceleration, int maxSpeed) {
        super(mark, model, cost, power, fuelConsumption, segment);
        this.roof = roof;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("SportCar{");
        sb.append(super.toString());
        sb.append(", roof=").append(roof);
        sb.append(", acceleration=").append(acceleration);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return isRoof() == sportCar.isRoof() &&
                Double.compare(sportCar.getAcceleration(), getAcceleration()) == 0 &&
                getMaxSpeed() == sportCar.getMaxSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRoof(), getAcceleration(), getMaxSpeed());
    }
}
