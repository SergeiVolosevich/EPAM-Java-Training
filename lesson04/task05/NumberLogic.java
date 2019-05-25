class NumberLogic {
    public static int reverseNumber(int number) {
        int a1 = number % 10;
	number /= 10;
	int a2 = number % 10;
	number /= 10;
	int a3 = number % 10;
	number /= 10;
	int a4 = number % 10;
	number /= 10;
	int a5 = number % 10;
	number /= 10;
        int a6 = number % 10;
        int a7 = number / 10;
        return a1 * 1000000 + a2 * 100000 + a3 * 10000 + a4 * 1000 + a5 * 100 +
               a6 * 10 + a7;
    }
}