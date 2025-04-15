package student;

public class StudentService {// 핵심 로직 클래스 CRUD(create read update delete)
	Student[] students = new Student[10];
	
	
	//등록
	void register() {
		System.out.println("등록 기능");
		int stuNum = StudentUtils.nextInt("학번을 입력하세요 >");
		String str = StudentUtils.nextLine("이름을 입력하세요 >");
		Student stu = new Student(stuNum,str);
		System.out.println("학번 : " + stu.no + " 이름 : " + stu.name);
		int korPoint = StudentUtils.nextInt("국어점수를 입력하세요 >");
		int matPoint = StudentUtils.nextInt("영어점수를 입력하세요 >");
		int engPoint = StudentUtils.nextInt("수학점수를 입력하세요 >");
		stu = new Student(stuNum, str, korPoint, engPoint, matPoint);
		System.out.println("국어점수 : " + korPoint + " 영어점수 : " + engPoint + " 수학점수 : " + matPoint);
		students[0] = stu;
		read();
	}
	//조회
	void read() {
		System.out.println("조회 기능");
		for(;;) {
			switch (StudentUtils.nextInt("1. 총점, 2. 평균 3. 뒤로가기")) {
			case 1:
				int sum = students[0].kor + students[0].eng + students[0].mat;
				System.out.println(sum);
				break;
			case 2:
				int average = (students[0].kor + students[0].eng + students[0].mat)/3;
				System.out.println(average);
				break;
			case 3:
				return;
			default:
				break;
			}
		}
	}
	//수정
	void modify() {
		System.out.println("수정 기능");
	}
	//삭제
	void remove() {
		System.out.println("삭제 기능");
	}
}
