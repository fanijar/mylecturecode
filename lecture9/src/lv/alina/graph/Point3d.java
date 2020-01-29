package lv.alina.graph;


//to inherit the class use keyword "extends"
public class Point3d extends Point2d{
	private int z;
	
	public Point3d(){
		super();//pārmanto default konstruktoru no superclass Point2d
		this.z = 0;
	}
	
	public Point3d(int x, int y, int z){
		super(x,y);//pārmanto to konstruktoru, kur iedoti x un y parametri, no superklases
		this.z = z;
		
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		return "("+super.getX()+", "+super.getY()+", "+this.z+")";
	}

}
