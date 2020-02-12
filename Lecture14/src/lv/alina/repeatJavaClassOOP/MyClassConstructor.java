package lv.alina.repeatJavaClassOOP;

public class MyClassConstructor {
	
	private int modelYear;
	private String modelName;
	
	public MyClassConstructor(){
		
	}
	
public MyClassConstructor(int year, String name){
	this.modelName = name;
	this.modelYear = year;
		
}

public String getModelName() {
	return modelName;
}


}
