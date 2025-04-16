package lesson07_2;

public class LocalValEx {
	public static void main(String[] args) {
		Local local = new Local();
		
		System.out.println(local.name);
		
		local.process(); //메서드 호출
		
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		for(int i = 0; i < 10; i++) {
			int temp = 0;
			temp += i;
		}
//		System.out.println(temp);
	}
}
class Local{
	String name; //인스턴스 변수
	void process() {
		String name;// 얘를 주석 처리하면 메서드 호출 후에 "홍길동"이 출력된다. name이 살아 있으면, 밑에 대입 변수가 process 내부 name으로 진행이 된다.(가까운 스코프로 접근)
		name = "홍길동"; //여기서 의미하는 name은 지역변수 name 의미
	}
	void printAge1() { 
		int age = 20; // 아래 age와 여기 age는 서로 다른 age
		System.out.println(age);
	}
	void printAge2() {
		int age = 30; //
		System.out.println(age);
	}
}