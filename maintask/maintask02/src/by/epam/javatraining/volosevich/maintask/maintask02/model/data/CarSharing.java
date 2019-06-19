package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import java.util.Objects;

public class CarSharing {
    private String nameCompany;
    private ListOfCars listOfCars;
    private int numberOfCars;

    public CarSharing() {
    }

    public CarSharing(String nameCompany) {
        this.nameCompany = nameCompany;
        listOfCars = new ListOfCars();
        numberOfCars = 0;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public ListOfCars getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(ListOfCars listOfCars) {
        this.listOfCars = listOfCars;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarSharing{");
        sb.append("nameCompany='").append(nameCompany).append('\'');
        sb.append(", listOfCars=").append(listOfCars);
        sb.append(", numberOfCars=").append(numberOfCars);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarSharing)) return false;
        CarSharing carSharing = (CarSharing) o;
        return getNumberOfCars() == carSharing.getNumberOfCars() &&
                getNameCompany().equals(carSharing.getNameCompany()) &&
                getListOfCars().equals(carSharing.getListOfCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameCompany(), getListOfCars(), getNumberOfCars());
    }
}
