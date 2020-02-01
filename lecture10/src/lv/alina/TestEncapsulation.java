package lv.alina;

import lv.alina.encapsulation.Student;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student student = new Student();//izveido instanci java klasē
		
		student.setName("Toms");
		System.out.println(student.getName());
	}

}
