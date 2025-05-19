package student;

public class Test {
	public static void main(String[] args) {
		Student student = new Student(1, "새똥이");
		Student s = m1(student);
		System.out.println(s);
		m2(student);
		System.out.println(student);
		int num = student.getNo() + 1;
		int result = m3(num);
		System.out.println(result);
		m4(result);
		System.out.println(result);
	}
	//함수형 정의 국어점수 변경함수
	static Student m1(Student student) {
		student.setKor(50);
		return student;
	}
	//프로시저형 정의
	static void m2(Student student) {
		student.setKor(70);
	}
	//함수형 정의 제곱
	static int m3 (int i) {
		System.out.println(i * i);
		return i * i;
	}
	//프로시저형 정의
	static void m4 (int i) {
		System.out.println(i * i);
	}
}
