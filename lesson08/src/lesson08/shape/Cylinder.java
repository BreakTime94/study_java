package lesson08.shape;

public class Cylinder extends Shape implements Shape3D {
	Circle circle;
	int z;
	
	public Cylinder() {
		
	}
	
	public Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}
	
	public double area() { //2 pi r^2 + 2 pi r h
		return 2 * circle.area() + circle.circum() * z;
	}
	
	public double volume () {
		return circle.area() * z ;
	}
}
