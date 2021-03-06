import java.util.Arrays;

public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variable
		int[] marks = { 76, 23, 42, 100, 99, 10, 56 };
		// Make toString all elements of array
		// print in console
		System.out.println(Arrays.toString(marks));
		System.out.println("---");

		System.out.println("[" + marks[0] + ", " + marks[1] + ", " + marks[2]
				+ ", " + marks[3] + ", " + marks[4] + ", " + marks[5] + ", "
				+ marks[6] + "] ");

		System.out.println("---");

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]);
		}
		System.out.println("");
		System.out.println("---");

		System.out.print("[");
		for (int i = 0; i < marks.length - 1; i++) {
			System.out.print(marks[i] + ", ");
		}
		System.out.print(marks[marks.length - 1] + "]");
		System.out.println("");
		System.out.println("---");
		System.out.print("[");
		for (int i = 0; i < marks.length - 1; i++) {
			System.out.print(marks[i] + ", ");
		}
		System.out.print(marks[6] + "]");

	}

}
