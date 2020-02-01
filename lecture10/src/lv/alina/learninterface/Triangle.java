package lv.alina.learninterface;

public class Triangle implements Shape {
	private int base;
	private int height;

	public Triangle(int b, int h) {
		this.base = b;
		this.height = h;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}
