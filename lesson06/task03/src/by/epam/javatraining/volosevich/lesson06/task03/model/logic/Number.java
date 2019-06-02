package by.epam.javatraining.volosevich.lesson06.task03.model.logic;

public class Number {
    public static double calcFactorial(int number) {
        double fact = 1E0;
        if (number >= 0 && number <= 170) {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        } else {
            return 0;
        }
        return fact;
    }
}
