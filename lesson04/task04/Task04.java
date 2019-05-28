public class Task04 {
    public static void main(String[] args) {
        int number = 123456;

        double arithmeticMean = NumberLogic.calcArithmeticMean(number);
        double geometricMean = NumberLogic.calcGeometricMean(number);

        Printer.print("Arithmetic mean = " + arithmeticMean);
        Printer.print("Geometric mean = " + geometricMean);
    }
}