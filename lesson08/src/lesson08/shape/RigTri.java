package lesson08.shape;

public class RigTri extends Shape {
	
	int b ; //밑변
	int h; // 높이
	public RigTri() {
		
	}
	public RigTri(int b, int h) {
		this.b = b;
		this.h = h;
	}
	
	public double circum () {
		return b + h + Math.sqrt(b * b + h * h); //sqrt만 인터넷 검색..
	}
	
	public double area () {
		return b * h / 2; 
	}
}
