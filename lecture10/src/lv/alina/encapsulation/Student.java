package lv.alina.encapsulation;

public class Student {
	private String name;
	
	//ja neuztaisa konstruktoru, java pazīst default konstuktoru (bez vērtībām, kad izsaucēj klasē var piešķirt)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
