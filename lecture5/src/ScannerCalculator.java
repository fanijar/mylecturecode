import java.util.Scanner;


public class ScannerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 is: ");
		int number1 = scanner.nextInt();
		System.out.println("Number 2 is: ");
		int number2 = scanner.nextInt();
		scanner.nextLine(); //lai nomainītu tipu no int uz String
		System.out.println("Operator is (/+-*%) : ");
		String Operator = scanner.nextLine();
		
		int result = 0;
		if(Operator.equals("+")){
			result = number1 + number2;
			
		}else if(Operator.equals("*")){
			result = number1 * number2;
			
		}else if(Operator.equals("-")){
			result = number1 - number2;
			
		}else if(Operator.equals("%")){
			result = number1 % number2;
			
		}else if(Operator.equals("/")){
			result = number1 / number2;

			
		System.out.println("Test result: "+result);
		
	}

}}
