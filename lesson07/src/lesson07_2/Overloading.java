package lesson07_2;

public class Overloading {
	public static void main(String[] args) {
		
		Operator op = new Operator();//Operator(); 오른쪽에 있는 친구는 생성자명 왼쪽은 클래스명
//		System.out.println(op.multiply(4, 3));
//		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));
//		System.out.println(Operator.multiply(3, 3)); static method가 아니어서 호출 불가
	}
}
class Operator {
//	int multiply(int x, int y) {
//		System.out.println("(int, int)");
//		return x * y;
//	}
//	int multiply(int a, int b) { //a, b로 파라미터가 다르게 표시해도 같은 메서드로 판명
//		System.out.println("(int, int)");
//		return a * b;
//	}
//	double multiply(double x, double y) {
//		System.out.println("(double, double)");
//		return x * y;
//	}
	double multiply(int x, double y) {
		System.out.println("(int, double)");
		return x * y;
	} //아래 메서드를 주석처리하면, int가 들어가는 arg를 자동으로 double로 형변환 해주어 출력해준다.
	double multiply(double x, int y) {
		System.out.println("(int, double)");
		return x * y;
	}
}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: The method multiply(int, double) is ambiguous for the type Operator
// int int double double을 주석처리 하게 되면, int int가 3번째 4번째 메서드 중 어디로 갈지 모호하다
