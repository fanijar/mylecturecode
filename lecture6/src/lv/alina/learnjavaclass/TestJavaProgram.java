package lv.alina.learnjavaclass;

public class TestJavaProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box boxObject = new Box(); //default constructor\
		
		
		
		double volume;
		
		
		boxObject.width = 20.23;// instances mainīgais
		boxObject.height = 3.42;
		boxObject.depth = 15.2;
		
		double result = boxObject.getVolume();
		System.out.println("Volume from method: "+result);
		
		volume = boxObject.width * boxObject.height * boxObject.depth;
		
		System.out.println("Volume is "+volume);
		
		

	}

}
