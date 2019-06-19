package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class SportUtilityCar extends Car {

    private int clearance;              /* measurement in mm   */
    private boolean fourWheelDrive;
    private boolean frameConstruction;
    private double torque;              /* measurement in N*m  */

    public SportUtilityCar() {
    }

    public SportUtilityCar(String mark, String model, double cost, double power, double fuelConsumption,
                           ClassOfCar segment, int clearance, boolean fourWheelDrive, boolean frameConstruction,
                           double torque) {
        super(mark, model, cost, power, fuelConsumption, segment);
        this.clearance = clearance;
        this.fourWheelDrive = fourWheelDrive;
        this.frameConstruction = frameConstruction;
        this.torque = torque;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFrameConstruction() {
        return frameConstruction;
    }

    public void setFrameConstruction(boolean frameConstruction) {
        this.frameConstruction = frameConstruction;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SportUtilityCar{");
        sb.append(super.toString());
        sb.append(", clearance=").append(clearance);
        sb.append(", fourWheelDrive=").append(fourWheelDrive);
        sb.append(", frameConstruction=").append(frameConstruction);
        sb.append(", torque=").append(torque);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportUtilityCar)) return false;
        if (!super.equals(o)) return false;
        SportUtilityCar that = (SportUtilityCar) o;
        return getClearance() == that.getClearance() &&
                isFourWheelDrive() == that.isFourWheelDrive() &&
                isFrameConstruction() == that.isFrameConstruction() &&
                Double.compare(that.getTorque(), getTorque()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getClearance(), isFourWheelDrive(), isFrameConstruction(), getTorque());
    }
}
