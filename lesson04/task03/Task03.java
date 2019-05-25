public class Task03 {
    public static void main(String[] args) {
        int number = 1315;

	boolean result = NumberLogic.isIncreasingSequence(number);

	System.out.println(result ? "Digits of a number form an increasing sequence." :
                           "Digits of numbers do not form an increasing sequence.");

        result = NumberLogic.isDiscendingSequence(number);

	System.out.println(result ? "Digits of a number form an discending sequence." :
                           "Digits of numbers do not form an discending sequence.");
    }
}