package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {//main 메서드
		int result = add(10, 20);
		System.out.println(result);		
		print("Hello"); // 출력 값은 변수에 담지 않아도 되는 것을 의미하나...? 
		System.out.println(addAll(10, 20, 30, 40, 50, 60)); //println은 void만 아니면 올 수 있다.
		
		//Stack 데이터 처리 기준 아래 쪽이 막힌 cup
		return; // 얘가 사실 생략되어있음. 현재 메서드 종료를 의미 break;는 반복 탈출, return;은 메서드 탈출
	}
	static int add(int a, int b) {// add 메서드, static을 붙인 이유는 편하게 하기 위해. int a와 int b는 파라미터 (함수로 치면 정의역) return은 치역
		return a + b;
	}
	static int addAll(int...nums) { // void 메서드는 return을 할 수 없다. 원래 void는 return; 이 있어야 한다.
		//...을 붙이면 파라미터의 갯수 제한이 없어진다. printf와 유사
		int ret = 0;
		for(int n : nums) {
			ret += n;
		}
		return ret; 
	}
	
	static void print(String s) {
		System.out.println(s);
	}
}
//매개 변수의 life cycle은 지역변수의 life cycle과 동일. 매개변수를 a로 선언하면 그 a로 지역변수 선언 못 함.
