package lesson08.shape;

public class Cylinder extends Shape {
	int r;
	int h;
	
	public Cylinder() {
		
	}
	
	public Cylinder(int r, int h) {
		this.r = r;
		this.h = h;
	}
	
	public double circum() {//밑면둘레
		return 2 * Math.PI * r;
	}
	
	public double area() { //2 pi r^2 + 2 pi r h
		return circum() * (r + h);
	}
	
	public double Volume () {
		return Math.PI * r * r * h ;
	}
}
