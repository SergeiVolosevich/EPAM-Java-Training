public class Task02 {
    public static void main(String[] args) {
        double innerRadius = 4;
	double outerRadius = 8;
	
	double square = RingLogic.calcSquare(outerRadius, innerRadius);

	System.out.printf("The area or the ring = %f", square);
    }
}