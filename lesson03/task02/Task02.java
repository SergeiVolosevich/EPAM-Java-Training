public class Task02 {
    public static void main(String[] args) {
        int a = 4;
	int b = 5;
	
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.printf("\nChanged numbers without any other variables - a = %d, b = %d\n",
                          a, b);
    }
}