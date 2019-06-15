class RingLogic {
    private static final double PI = 3.14159265358;

    public static double calcSquare(double outerRadius, double innerRadius) {
        return PI * (outerRadius * outerRadius - innerRadius * innerRadius);
    }
}