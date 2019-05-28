public class Task03 {
    public static void main(String[] args) {
        int number = 1234;

	boolean result = NumberLogic.isIncreasingSequence(number);

	Printer.printDependOnCondition(result, "Digits of a number form an increasing sequence.",
	        "Digits of numbers do not form an increasing sequence.");

        result = NumberLogic.isDiscendingSequence(number);

        Printer.printDependOnCondition(result, "Digits of a number form an discending sequence.",
	        "Digits of numbers do not form an discending sequence.");
    }
}