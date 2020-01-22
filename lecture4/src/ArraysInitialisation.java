import java.util.Arrays;


public class ArraysInitialisation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbersOfArrays = {33, 45, 23, 56};
		int lengthOfArrays = numbersOfArrays.length;
		
		System.out.println(lengthOfArrays);
		
		numbersOfArrays[3] = 20;
		
		System.out.println(Arrays.toString(numbersOfArrays));

	}

}
