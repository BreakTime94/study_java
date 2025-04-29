package javajung;

public class GenericEx {
	public static void main(String[] args) {
	
		Box<Integer> box = new Box<>(10);
		Box<String> box2 = new Box<>("가나다라");
	}
}

class Box<T>{ //T라는 것은 인스턴스 생성시에 따라서 결정됨
	T t;
	
	public Box(T t) {
	super();
	this.t = t;
}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}