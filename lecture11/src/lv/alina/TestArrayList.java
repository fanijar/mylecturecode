package lv.alina;

import java.util.ArrayList;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[2];
		System.out.println(arr.length);
		arr[0] = "ElementName";
		System.out.println(arr[0]);
		
		ArrayList<String> array = new ArrayList<>();
		System.out.println(array.size());
		array.add("Element1");
		array.add("Element2");
		array.add("Element3");
		array.add("Element 4");
		System.out.println(array);
		System.out.println(array.size());

	}

}
