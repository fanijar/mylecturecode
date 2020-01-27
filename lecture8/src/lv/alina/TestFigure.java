package lv.alina;

import lv.alina.figure.Rectangle;

public class TestFigure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle ();//rectangle - instance
		System.out.println(rectangle.toString());
		
		Rectangle rectangle2 = new Rectangle (0.5f, 0.8f);//rectangle2 - instance
		System.out.println(rectangle2);
		
		Rectangle rectangle3 = new Rectangle (3.4f);//rectangle3 - instance
		System.out.println(rectangle3);

	}

}
