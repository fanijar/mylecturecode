package lv.alina;

import lv.alina.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {

		Circle figure = new Circle();

		Circle figure2 = new Circle(40.2);
		
		Circle figure3 = new Circle(20.1, "green");
		
	
		
		System.out.println(figure.getColor() + " " + figure.getRadius());
		
		System.out.println(figure2.getColor() + " " + figure2.getRadius());
		
		System.out.println(figure3.getColor() + " " + figure3.getRadius());
		
		System.out.println("Area is: "+figure.getArea(4.1));
		System.out.println(figure3.toString()+"; Circle area: "+figure3.getArea(5));
	
	}

}
