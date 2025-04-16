package lesson07_2;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student(); // 생성자도 오버로딩 가능
		Student stu = new Student("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}
}
