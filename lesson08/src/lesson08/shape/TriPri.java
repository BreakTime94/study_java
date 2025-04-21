package lesson08.shape;

public class TriPri {
	
	int x;
	int y;
	int z;
	int h;
	double s = (x + y + z) /2d ;
	
	public TriPri() { // 헤론의 공식 찾아봄
		
	}
	
	public TriPri(int x, int y, int z, int h) {
		this.x = x;
		this.y = y;
		this.z = z; 
		this.h = h;
	}
	
	public double circum() {//전체 둘레
		return 2 * (x + y + z) + 3 * h;
	}
	
	public double area() { //똑같은 면이 2개씩 2 * (xy + yz +zx)
		return h * (2 * s) + Math.sqrt(s * (s - x) * (s - y) * (s - z));
	}
	
	public double volume () {
		return Math.sqrt(s * (s - x) * (s - y) * (s - z)) * h ;
	}
}
