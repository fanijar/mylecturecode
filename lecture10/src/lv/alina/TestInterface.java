package lv.alina;

import lv.alina.learninterface.Rectangle;
import lv.alina.learninterface.Shape;
import lv.alina.learninterface.Triangle;

public class TestInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;

		Rectangle r1 = new Rectangle(num1, num2);

		System.out.println(r1.getLength() + " " + r1.getWidth());
		System.out.println(" ");

		Shape figure = new Rectangle(6, 7);
		System.out.println("Rectangle:");
		System.out.println("Area: " + figure.getArea());
		System.out.println(figure.toString());
		System.out.println(" ");

		Shape figure2 = new Triangle(4, 5);
		System.out.println("Triangle:");
		System.out.println("Area: " + figure2.getArea());
		System.out.println(figure2.toString());

	}

}
