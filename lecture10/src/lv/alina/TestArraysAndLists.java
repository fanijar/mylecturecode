package lv.alina;

public class TestArraysAndLists {

	public static void main(String[] args) {
		String[] arr = new String[10];
		String[] arrWith = { "1", "2", "6", "9", "4", "22", "34", "12", "58",
				"70" };
		arrToString(arr);
		System.out.println();
		arrToString(arrWith);
		addElementToArr(arrWith);

	}

	public static void arrToString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index number for index " + i + " is: " + arr[i]);
		}
	}
	
	public static void addElementToArr(String[] arr){
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + i;
			
		}
		System.out.println();
		arrToString(arr);
	}
}
