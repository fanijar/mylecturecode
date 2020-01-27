package lv.alina.figure;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	//konstruktors - defaultais
	public Rectangle(){
		this.length = 2;
		this.width = 4;
		
	}
// vēl viens konstruktors
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	//vēl viens konstruktors
	public Rectangle(float length){
		this.length = length;
		this.width = 12.0f;
		
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	public String toString(){
		return "Length: "+this.length+"; Width: "+this.width;
	}
	
}
