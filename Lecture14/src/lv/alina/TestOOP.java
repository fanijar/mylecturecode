package lv.alina;

import lv.alina.repeatJavaClassOOP.ClassExtendsAbstractClass;
import lv.alina.repeatJavaClassOOP.Encapsulation;
import lv.alina.repeatJavaClassOOP.InterfaceImplement;
import lv.alina.repeatJavaClassOOP.MyClass;
import lv.alina.repeatJavaClassOOP.MyClassConstructor;
import lv.alina.repeatJavaClassOOP.MyClassMethods;
import lv.alina.repeatJavaClassOOP.MyEnums;

public class TestOOP {

	public static void main(String[] args) {
		MyClass newObj = new MyClass();
		MyClass newObj2 = new MyClass();
		String strObj = "hello";
		String strObj2 = "hello";
		
		System.out.println(newObj.equals(newObj2));
		System.out.println(strObj.equals(strObj2));
		System.out.println(newObj.x);
		
		MyClassMethods myObjMethod = new MyClassMethods();
		
		double numberDouble = myObjMethod.returnDouble();
		
		System.out.println(numberDouble);
		
		myObjMethod.myMethod();
		
		myObjMethod.myStringMethod();
		
		System.out.println(myObjMethod.myStringMethod());
		
		
		System.out.println(myObjMethod.returnChar(210, 15));
		
		MyClassConstructor constructorObj1 = new MyClassConstructor(2010, "VW");
		MyClassConstructor constructorObj2 = new MyClassConstructor(2018, "BMW");
		MyClassConstructor constructorObj3 = new MyClassConstructor(2015, "VOLVO");
		constructorObj1.getModelName().equals(constructorObj3.getModelName());
		
		System.out.println(constructorObj1.getModelName().equals(constructorObj3.getModelName()));
		System.out.println(constructorObj3.getModelName());
		

		Encapsulation encapObj = new Encapsulation();
		System.out.println(encapObj.getUser());
		encapObj.setUser("Alina");
		System.out.println(encapObj.getUser());
		
		InterfaceImplement interfObj = new InterfaceImplement();
		interfObj.sendEmail();
		System.out.println(interfObj.sendEmailCount() );
		System.out.println(interfObj.sendEmailCount() );
		
		MyEnums status = MyEnums.HIGH;
		System.out.println("This object is too "+status);
		System.out.println(MyEnums.LOW);
		
		switch(status){
		case LOW:
			System.out.println("L");
			break;
		case MEDIUM:
			System.out.println("M");
			break;
		case HIGH:
			System.out.println("H");
			break;
			default:
				System.out.println("No status");
		}
		
		String numberStr = "240";
		int numberInt = Integer.parseInt(numberStr);
		int result = 30 + numberInt;
		System.out.println(numberInt);
		System.out.println(result);
		
		
		String numberStr1 = "240.9";
		double numberDouble1 = Double.parseDouble(numberStr1);
		double result2 = 30 + numberDouble1;
		System.out.println(numberDouble1);
		System.out.println(result2);
		
		String numberStrValue = "20";
		Integer valueInt = Integer.valueOf(numberStrValue);
		System.out.println(valueInt);
		
		
		ClassExtendsAbstractClass ojbAbstrClass = new ClassExtendsAbstractClass();
		ojbAbstrClass.sleep();
		ojbAbstrClass.abstractMethod();
		}
		}
		
	


