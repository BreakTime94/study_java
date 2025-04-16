package student;

import java.util.Arrays;

public class StudentService {// 핵심 로직 클래스 CRUD(create read update delete)
	Student[] students = new Student[2]; 
	//Student는 타입이 참조자료형이기 때문에 일단 null 이다. type은 student type 이고, 이는 student class에서 만든 필드를 요소로 구성한다?
	
	// null pointer 오류. 위의 생성한 students 배열을 초기화 해주지 않으면 생기는 오류다.
	// students의 기본 값은 전부 null 이지만, 이는 전부 주소 값이 없기에 공간 자체가 없다고 본다.
	
	// 수정 및 삭제 구현 (학번 불가, 이름 점수 가능), 평균 기능 추가 
	// 추가 입력하고자 할 때, 배열을 먼저 늘리는 기능도 추가
	
	int count = 0;
	//등록
	void register() {
		if(count >= students.length) {
			students = Arrays.copyOf(students, students.length * 2);
			System.out.println(Arrays.toString(students));
		}
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번(1부터 자연수로) > ");
		String name  = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어점수 > ");
		int mat = StudentUtils.nextInt("영어점수 > ");
		int eng = StudentUtils.nextInt("수학점수 > ");
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	//조회
	void read() {
		System.out.println("조회 기능"); // 등록 학생 전체 조회
		for(int i = 0; i < count; i++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
		}
	}
	//수정
	void modify() {
		System.out.println("수정 기능"); // 개별 수정
		int no = StudentUtils.nextInt("학번 > ");
		if(students[no-1].name != null) {
		students[no-1].name  = StudentUtils.nextLine("이름수정 > ");
		students[no-1].kor = StudentUtils.nextInt("국어점수 수정> ");
		students[no-1].eng = StudentUtils.nextInt("영어점수 수정> ");
		students[no-1].mat = StudentUtils.nextInt("수학점수 수정> ");
		System.out.println("수정이 기능이 종료됩니다."); 
		}
		else {
			System.out.println("이름을 등록하시길 바랍니다.");
			read();
		}
	}
	//삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("학번 > ");
		for(;;) {
			switch (StudentUtils.nextInt("1. 이름, 2. 국어 3. 영어 4. 수학 5. 뒤로가기")) {
			case 1:
				students[no-1].name  = null;
				break;
			case 2:
				students[no-1].kor = 0;
				break;
			case 3:
				students[no-1].eng = 0;
				break;
			case 4:
				students[no-1].mat = 0;
				break;
			case 5:
				System.out.println("삭제 기능이 종료됩니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}
}
