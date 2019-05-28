class Printer {
    public static void printDependOnCondition(boolean condition, String trueMessage, String falseMessage) {
	System.out.println(condition ? trueMessage : falseMessage);
    }
}