
public class ArraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = { 76, 23, 42, 100, 99, 10, 56 };
		
		//sum all values in arrays
		//print in console
		
		//int result = 10;
		//int testInt = 90;
		//result = testInt;
		
		//System.out.println("result value: "+result);
		
		int sum = 0;
		for(int i = 0; i < marks.length ; i++){
			sum += marks[i];
		}
		System.out.println("sum of marks: "+sum);
		
		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest = sumTest + 220;
		sumTest = sumTest + 240;
	
		
		System.out.println("Testing += operator: "+sumTest);
		
		System.out.println("---");
		

		int sumTest1 = 0;
		sumTest1 = sumTest1 + 200;
		sumTest1 += 220;
		sumTest1 += 240;
	
		
		System.out.println("Testing += operator: "+sumTest);
		
System.out.println("---");
		
//-+ 

		int subOperator = 1000;
		subOperator = subOperator - 200;
		subOperator -= 220;
		subOperator -= 240;
	
		
		System.out.println("Testing -= operator: "+subOperator);
		
		System.out.println("---");
		

		int subOperator1 = 1000;
		subOperator1 = subOperator1 - 200;
		subOperator1 = subOperator1 - 220;
		subOperator1 = subOperator1 - 240;
	
		
		System.out.println("Testing -= operator: "+subOperator1);
	

	}

}
