class NumberLogic {
    public static boolean isIncreasingSequence(int number) {
        int a1 = number % 10;
	number /= 10;
	int a2 = number % 10;
	number /= 10;
	int a3 = number % 10;
	int a4 = number / 10;
	return a4 < a3 && a3 < a2 && a2 < a1;
    }
    
    public static boolean isDiscendingSequence(int number) {
        int a1 = number % 10;
	number /= 10;
	int a2 = number % 10;
	number /= 10;
	int a3 = number % 10;
	int a4 = number / 10;
        return a4 > a3 && a3 > a2 && a2 > a1;
    }
}