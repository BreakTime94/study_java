package javajung;

public class PrimitiveParamEx {
	public static void main(String[] args) {
	Data data = new Data();
	data.x = 10;
	System.out.println(data.x);
	
	primiChange(data.x);
	System.out.println("After change (data.x)");
	System.out.println("main() : x = " + data.x);
	
	System.out.println("참조변수 변경 메서드====");
	referChange(data);
	System.out.println("After refchange (data.x)");
	System.out.println("main() : x = " + data.x);
	
	}
	static void primiChange(int x) {// 기본형 매개변수를 사용하였다. 
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	static void referChange(Data data) {//data 타입 참조자료를 통으로 받아서 거기서 수정하면(주소값에 직접 접근하여 수정됨)
		data.x = 1000;
		System.out.println("change() : x = " + data.x);
		
	}
}

class Data {
	int x;
}
