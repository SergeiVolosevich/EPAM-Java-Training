package by.epam.javatraining.volosevich.maintask.maintask02.model.data;

import by.epam.javatraining.volosevich.maintask.maintask02.model.exception.InvalidParameterException;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class ListOfCars {

    private static final int INCREASING_VALUE = 10;
    private static final int START_SIZE = 10;

    private Car[] cars;
    private int size;

//        private static final Logger log = Logger.getLogger();

    public ListOfCars() {
        cars = new Car[START_SIZE];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Car get(int index) throws InvalidParameterException {
        checkIndex(index);
        return cars[index];
    }

    public void add(Car car) {
        if (size == cars.length) {
            grow();
        }
        cars[size++] = car;
    }

    private void grow() {
        Car[] a = new Car[cars.length + INCREASING_VALUE];
        for (int i = 0; i < cars.length; i++) {
            a[i] = cars[i];
        }
        cars = a;
    }


    private void checkIndex(int index) throws InvalidParameterException {
        if (index < 0 || index >= size)
            throw new InvalidParameterException();
    }


    public void set(int index, Car car) throws InvalidParameterException {
        checkIndex(index);
        cars[index] = car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListOfCars{");
        sb.append("objects=").append(Arrays.toString(cars));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListOfCars)) return false;
        ListOfCars that = (ListOfCars) o;
        return getSize() == that.getSize() &&
                Arrays.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSize());
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}
