public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		double second = Integer.valueOf(arg[1]);
		System.out.println("Sum " + (first + second));
		System.out.println("Raz " + (first - second));
		System.out.println("Umn " + (first * second));
		System.out.println("Del " + (first / second));
	}
}