package lv.alina;

public class LearnMethodsWithType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double area = getArea(); // klase var tikt izmantota kā mainīgā vērtība
		
		System.out.println("area is: "+area);
	}
	
	public static double getArea(){
		double num1 = 20.3;
		double num2 = 10.0;
		double result = num1 * num2;
		System.out.println("area is: "+result);
		return result;
		
	}

}