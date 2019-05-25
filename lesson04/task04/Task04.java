public class Task04 {
    public static void main(String[] args) {
        int number = 123456;

        double arithmeticMean = NumberLogic.calcArithmeticMean(number);
        double geometricMean = NumberLogic.calcGeometricMean(number);

        System.out.printf("Arithmetic mean = %f\n", arithmeticMean);
        System.out.printf("Geometric mean = %f", geometricMean);
    }
}