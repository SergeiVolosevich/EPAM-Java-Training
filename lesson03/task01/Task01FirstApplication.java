public class Task01FirstApplication {
    public static void main(String[] args) {
        int degrees;
	double radians;
	
	degrees = 32;
        
        radians = CornerConversion.toRadians(degrees);

	System.out.printf("\n%d Degrees is %.3f Radians\n", degrees, radians);
    }
}