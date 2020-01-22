
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = { 76, 23, 42, 100, 99, 10, 56 };
		//for-each loops
		for(int mark : marks){
			System.out.println(mark);
		}

		System.out.println("---");
	
		for(int i = 0; i < marks.length ; i++){
			System.out.println(marks[i]);
	}

}}
