package lv.alina.repeatJavaClassOOP;

public class MyClassMethods {
	
	public MyClass myClass;
	public MyClass createNewObjMyClass(){
		return new MyClass();
	}
	
	public static void myMethod(){
		System.out.println("hello world");
	}
	
	public String myStringMethod(){
		 myMethod();
		
		return"Hello";
	}
	
	public double returnDouble(){
		return 60.3;
	}
	
	public char returnChar(int a, int b){
		int charFromInt = a+b;
		
		char charVariable = (char)charFromInt;
		
		return charVariable;
	}

}
