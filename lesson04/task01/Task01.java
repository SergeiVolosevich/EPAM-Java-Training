public class Task01 {
    public static void main(String[] args) {
        double a = 3.0;
	double b = 3.6;
	double c = 3.5;
	
	boolean result = NumberLogic.checkEqualityOfNumbers(a, b, c);

	Printer.printDependOnCondition(result, "Three numbers are the same.",
                                         "At least one number is different.");

	result = NumberLogic.checkInequalityOfNumbers(a, b, c);

	Printer.printDependOnCondition(result, "Three numbers are different.", 
                                         "At least one pair of numbers are equal.");
    }
}