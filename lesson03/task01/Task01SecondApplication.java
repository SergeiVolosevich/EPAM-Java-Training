public class Task01SecondApplication {
    public static void main(String[] args) {
        double radians;
	double degrees;
	
	radians = 0.559;
        
        degrees = CornerConversion.toDegrees(radians);

	System.out.printf("\n%.3f Radians is %.3f Degrees\n", radians, degrees);
    }
}