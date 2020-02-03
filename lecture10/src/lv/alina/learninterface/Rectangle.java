package lv.alina.learninterface;

public class Rectangle implements Shape {
	private int length;
	private int width;


	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
		

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;

	}



	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		return length * width;
	}


}
