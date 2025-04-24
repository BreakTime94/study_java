package lesson16;

public class StackOverFlowTest {
	public static void main(String[] args) throws Exception { 
//		main(args);
		
//		new Data();
//		new Data();
//		Class.forName("lesson16.Data");
		Data.print(1); // 클래스로 직접 메서드 호출
		Data.print(1); // 클래스로 직접 메서드 호출
		Data.print(1); // 클래스로 직접 메서드 호출
		Data.print(1); // 클래스로 직접 메서드 호출
	}
}

class Data{
//	Data data = new Data(); 인스턴스 생성전에 클래스를 먼저 초기화를 진행한다.
	int i = print(1);
	static int si = print(2);
	
	{
		System.out.println("초기화 블럭");
	}
	static {
		System.out.println("클래스 초기화 블럭");
	}
	public Data() {
		System.out.println("생성자");
	}
	static int print(int i) {
		System.out.println("print 호출됨 :: " + i);
		return i;
	}
	
}