package lv.alina;

import lv.alina.graph.Point2d;
import lv.alina.graph.Point3d;
import lv.alina.graph.Point4d;

public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point2d point = new Point2d();
		System.out.println(point.toString());
		
		Point2d point2 = new Point2d(3, 5);
		System.out.println(point2.toString());
		
		point2.setX(8);
		point2.setY(4);
		System.out.println(point2);
		
		System.out.println("x: "+point2.getX());

		Point3d point3 = new Point3d();
		System.out.println(point3);
		
		Point3d point4 = new Point3d(5,8, 13);
		System.out.println(point4);
		
		point4.setY(57);
		System.out.println(point4);
		
		Point4d point5 = new Point4d(8, 9, 0, 6);
		System.out.println(point5);
		System.out.println(point5.getX());
	}

}
