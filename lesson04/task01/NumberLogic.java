class NumberLogic {
    public static boolean checkEqualityOfNumbers(double a, double b, double c) {
        return a == b && b == c;
    }
    
    public static boolean checkInequalityOfNumbers(double a, double b, double c) {
        return a != b && b != c && a != c;
    }
}