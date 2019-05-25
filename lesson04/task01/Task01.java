public class Task01 {
    public static void main(String[] args) {
        double a = 3.5;
	double b = 3.5;
	double c = 3.5;
	
	boolean result = NumberLogic.checkEqualityOfNumbers(a, b, c);

	System.out.println(result ? "Numbers are the same." : "Nubers are different.");
    }
}