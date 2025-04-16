package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {// 이거 복습 필수 !!!!
		// this는 미래에 생성될 객체의 주소값
		Member m = new Member(20); //생성자 호출, 객체 생성
		System.out.println(m.num); // m 객체가 num 변수 호출
		System.out.println(m); // 
		Member member = m.m1();// m1은 메서드
		System.out.println(member);
		m.m2(m);
		
	}
}
class Member {
	int num = 10; //필드, 인스턴스 변수
	Member(int num){// 생성자
		this.num = num; 
	}
	Member m1() {// 함수 호출의 입력쪽이 내 타입
		return this;
	}
	void m2(Member m) {
		System.out.println(m);
	}
}
//처음 20 값을 집어넣었고, new 연산자를 통해 생성자를 호출한다. 
//JVM 내 호출 스택 은 컵 구조로 보면 되고 아래는 HEAP이라고 한다. 컵 위에도 무언가 있지만 이번에 생략한다. 
// 20을 넣으면, HEAP 공간내 필드 공간만 확보한다 (num = 10) 
// this를 없애면 num 값은 그대로 10이 된다. 
// 사용자가 m으로 호출할지 뭐로할지 모른다.
// this.num 은 출력값이 20이다.
