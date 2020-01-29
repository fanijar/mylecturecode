package lv.alina;

import lv.alina.users.Teacher;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strArr = new String[12];
		strArr[0] = "Math";
		strArr[1] = "English";
		
		System.out.println(strArr[0]+", "+strArr[1]);
		
		
		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1);
//		teacher1.addCourse("Sport");
//		teacher1.addCourse("Math");
//		teacher1.addCourse("English");
//		teacher1.addCourse("Biology");
		String[] courses = {"Sport", "Math", "English", "Biology"};
		
		//for-each loops
		for(String course : courses){
			teacher1.addCourse(courses);
			
		}

	}

}
