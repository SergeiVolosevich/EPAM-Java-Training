class NumberLogic {
    public static int reverseNumber(int number) {
        int numberOrder = number % 10;
	int reverseNumber = numberOrder;
	number /= 10;

	numberOrder = number % 10;
        reverseNumber = reverseNumber * 10 + numberOrder;
	number /= 10;

	numberOrder = number % 10;
        reverseNumber = reverseNumber * 10 + numberOrder;
	number /= 10;

	numberOrder = number % 10;
        reverseNumber = reverseNumber * 10 + numberOrder;
	number /= 10;

	numberOrder = number % 10;
	reverseNumber = reverseNumber * 10 + numberOrder;
	number /= 10;

        numberOrder = number % 10;
	reverseNumber = reverseNumber * 10 + numberOrder;

        numberOrder = number / 10;
	reverseNumber = reverseNumber * 10 + numberOrder;
        return reverseNumber;
    }
}