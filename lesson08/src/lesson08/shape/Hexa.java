package lesson08.shape;

public class Hexa extends Shape {
	
	int x;
	int y;
	int z;
	
	public Hexa() {
		
	}
	
	public Hexa(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double circum() {//전체 둘레
		return 4 * (x + y + z);
	}
	
	public double area() { //똑같은 면이 2개씩 2 * (xy + yz +zx)
		return 2 * (x * y+ y * z + z * x);
	}
	
	public double Volume () {
		return x * y * z;
	}
	
}
