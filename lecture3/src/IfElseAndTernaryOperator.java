public class IfElseAndTernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ternary operator '?'
		boolean test = false;
		int num = 2 + 2;

		if (test) {
			System.out.println("Test pass true");
		} else {
			System.out.println("Test pass false");
		}
		String stringExp = "Te ir string vērtība";

		String res = (test) ? "Test pass true" : "Test pass false";
		System.out.println(res);
		System.out.println(stringExp);

		int num1 = 5;
		int num2 = 10;
		int result;

		result = (num1 < num2) ? (num1 + num2) : (num1 - num2);
		// ternary variable = (condition) ? true : false
		System.out.println(result);
	}

}
