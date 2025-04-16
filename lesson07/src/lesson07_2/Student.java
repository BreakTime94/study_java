package lesson07_2;

public class Student {
	String name;
	int grade;
	String department;
	
	Student() {};// 기본 생성자 타입, 생략되어 있지만 컴파일러가 추가해줌.
	
	Student(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}
