package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class FamilyCar extends Car {

    private int numberAdditionalSeats;
    private boolean airCondition;
    private int numberOfAirbags;
    private boolean childSeat;
    private int trunkVolume;

    public FamilyCar() {
    }

    public FamilyCar(String mark, String model, double cost, double power, double fuelConsumption,
                     ClassOfCar segment, int numberAdditionalSeats, boolean airCondition,
                     int numberOfAirbags, boolean childSeat, int trunkVolume) {
        super(mark, model, cost, power, fuelConsumption, segment);
        this.numberAdditionalSeats = numberAdditionalSeats;
        this.airCondition = airCondition;
        this.numberOfAirbags = numberOfAirbags;
        this.childSeat = childSeat;
        this.trunkVolume = trunkVolume;
    }

    public int getNumberAdditionalSeats() {
        return numberAdditionalSeats;
    }

    public void setNumberAdditionalSeats(int numberAdditionalSeats) {
        this.numberAdditionalSeats = numberAdditionalSeats;
    }

    public boolean getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public int getNumberOfAirbags() {
        return numberOfAirbags;
    }

    public void setNumberOfAirbags(int numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }

    public boolean getChildSeat() {
        return childSeat;
    }

    public void setChildSeat(boolean childSeat) {
        this.childSeat = childSeat;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FamilyCar{");
        sb.append(super.toString());
        sb.append(", numberAdditionalSeats=").append(numberAdditionalSeats);
        sb.append(", airCondition=").append(airCondition);
        sb.append(", numberOfAirbags=").append(numberOfAirbags);
        sb.append(", childSeat=").append(childSeat);
        sb.append(", trunkVolume=").append(trunkVolume);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FamilyCar)) return false;
        if (!super.equals(o)) return false;
        FamilyCar familyCar = (FamilyCar) o;
        return getNumberAdditionalSeats() == familyCar.getNumberAdditionalSeats() &&
                getAirCondition() == familyCar.getAirCondition() &&
                getNumberOfAirbags() == familyCar.getNumberOfAirbags() &&
                getChildSeat() == familyCar.getChildSeat() &&
                getTrunkVolume() == familyCar.getTrunkVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberAdditionalSeats(), getAirCondition(), getNumberOfAirbags(),
                getChildSeat(), getTrunkVolume());
    }
}
