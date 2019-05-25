class NumberLogic {
    public static double calcArithmeticMean(int number) {
        int a1 = number % 10;
	number /= 10;
	int a2 = number % 10;
	number /= 10;
	int a3 = number % 10;
	number /= 10;
	int a4 = number % 10;
	number /= 10;
	int a5 = number % 10;
	int a6 = number / 10;
	return (a1 + a2 + a3 + a4 + a5 + a6) / 6.0;
    }
    
    public static double calcGeometricMean(int number) {
        int a1 = number % 10;
	number /= 10;
	int a2 = number % 10;
	number /= 10;
	int a3 = number % 10;
	number /= 10;
	int a4 = number % 10;
	number /= 10;
	int a5 = number % 10;
	int a6 = number / 10;
        return Math.pow((a1 * a2 * a3 * a4 * a5 * a6), 1/6.0);
   }
}