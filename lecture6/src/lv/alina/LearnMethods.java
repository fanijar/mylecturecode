package lv.alina;

public class LearnMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) { //void - nav tipa - atgriezīs jebkuru tipu; 
		//static  - nevajag izsaukt (izmantot) klases objektu ; 
		//public - pieejamība
		//
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		System.out.println("-----");
		getMyCity();
		String objectString = "53424 djshf";
		LearnMethods classObject = new LearnMethods(); // klasē izveido klases objektu
		
		classObject.doYouHaveACat();

	}
	public static void getMyName(){
		System.out.println("My name is Alina");

	}
	public static void getMyCity(){
		getMyName();
		System.out.println("My city is Riga");
	}
	public void doYouHaveACat(){
		System.out.println("No");
		
	}
}
