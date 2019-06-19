package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class LuxuryCar extends Car {

    private InteriorColor interiorColor;
    private int numberOfMonitors;
    private double amountAlcohol;    /* measurement in liters */
    private boolean personalDriver;

    public LuxuryCar() {
    }

    public LuxuryCar(String mark, String model, double cost, double power, double fuelConsumption,
                     ClassOfCar segment, InteriorColor interiorColor, int numberOfMonitors, double amountAlcohol,
                     boolean personalDriver) {
        super(mark, model, cost, power, fuelConsumption, segment);
        this.interiorColor = interiorColor;
        this.numberOfMonitors = numberOfMonitors;
        this.amountAlcohol = amountAlcohol;
        this.personalDriver = personalDriver;
    }

    public InteriorColor getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(InteriorColor interiorColor) {
        this.interiorColor = interiorColor;
    }

    public int getNumberOfMonitors() {
        return numberOfMonitors;
    }

    public void setNumberOfMonitors(int numberOfMonitors) {
        this.numberOfMonitors = numberOfMonitors;
    }

    public double getAmountAlcohol() {
        return amountAlcohol;
    }

    public void setAmountAlcohol(double amountAlcohol) {
        this.amountAlcohol = amountAlcohol;
    }

    public boolean isPersonalDriver() {
        return personalDriver;
    }

    public void setPersonalDriver(boolean personalDriver) {
        this.personalDriver = personalDriver;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LuxuryCar{");
        sb.append(super.toString());
        sb.append(", interiorColor=").append(interiorColor);
        sb.append(", numberOfMonitors=").append(numberOfMonitors);
        sb.append(", amountAlcohol=").append(amountAlcohol);
        sb.append(", personalDriver=").append(personalDriver);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LuxuryCar)) return false;
        if (!super.equals(o)) return false;
        LuxuryCar luxuryCar = (LuxuryCar) o;
        return getNumberOfMonitors() == luxuryCar.getNumberOfMonitors() &&
                Double.compare(luxuryCar.getAmountAlcohol(), getAmountAlcohol()) == 0 &&
                isPersonalDriver() == luxuryCar.isPersonalDriver() &&
                getInteriorColor() == luxuryCar.getInteriorColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getInteriorColor(), getNumberOfMonitors(), getAmountAlcohol(),
                isPersonalDriver());
    }
}
