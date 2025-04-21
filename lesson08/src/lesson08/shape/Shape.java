package lesson08.shape;

public abstract class Shape { //실제 구현과 아무 의미가 없다. 그냥 공통점을 묶기 위해 묶어둔 것이다.
//	public abstract double circum(); 
	public abstract double area();
	
	
	public String toString() {
		return "넓이 : " + area();
	}
	// 이후 자손들은 개별 오버라이딩을 해서 사용하여야 한다.
	// 인터페이스를 섞어 써보자.
}
