package lesson07;

public class MemberMain {
	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.num = 1;
		m.name = "전상현";
		m.age = 28;
		
		Member m2 = new Member();
		
		m2.num = 2;
		m2.name = "김지유";
		m2.age = 22;
		
		//객체의 변수에 접근하기 위해서는 . 을 사용
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);
		
		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		m2 = m;
		m2.age = 30; //m2의 주소 값이 m의 주소 값으로 씌워져 있기 때문에, m의 주소 값 내 age 값이 변경 된다.
		m.num = 3;
		
		//다양한 형태의 자료를 저장할 때도 class를 사용
		
		if (m == m2) {
			System.out.println("m객체와 m2객체는 같다.");
		} else {
			System.out.println("m객체와 m2객체는 같지 않다.");
		}
	}
}
